package com.ddweilai.microservice.base.system.provider.serviceimpl;

import com.ddweilai.microservice.base.system.api.service.IDictService;
import com.ddweilai.microservice.base.system.provider.mapper.DictMapper;
import com.ddweilai.microservice.common.api.Paging;

import com.ddweilai.microservice.base.system.api.entity.DictDetail;
import com.ddweilai.microservice.base.system.api.entity.DictMain;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("dictServiceImpl")
public class DictServiceImpl implements IDictService {

    @Resource
    private DictMapper dictMapper;

    @Override
    public Map<String, Map<String, String>> getCache() {
        Map<String, Map<String, String>> cacheMap = new HashMap<String, Map<String, String>>();
        List<DictMain> cacheList = dictMapper.getCache();
        cacheList.forEach( item -> {
            Map<String, String> detailMap = cacheMap.getOrDefault(item.getDictName(), new HashMap<String, String>());
            List<DictDetail> details = item.getDetails();
            details.forEach( detail -> {
                detailMap.put(detail.getDetailName(),detail.getDetailContent());
            });
            cacheMap.put(item.getDictName(), detailMap);
        });
        return cacheMap;
    }

    @Override
    public Boolean saveDict(DictMain dictMain) {
        Date date = new Date();
        dictMain.setCreatedAt(date);
        dictMain.setUpdatedAt(date);
        dictMain.setDisabled(false);
        int insert = dictMapper.insert(dictMain);
        if(insert == 1){
            List<DictDetail> details = dictMain.getDetails();
            if(details != null && !details.isEmpty()){
                for (DictDetail detail : details) {
                    detail.setCreatedAt(date);
                    detail.setUpdatedAt(date);
                    detail.setCreatedUserId(dictMain.getCreatedUserId());
                    detail.setCreatedUserName(dictMain.getCreatedUserName());
                    detail.setUpdatedUserId(dictMain.getUpdatedUserId());
                    detail.setDictName(dictMain.getDictName());
                    detail.setDisabled(false);
                    dictMapper.insertItem(detail);
                }
            }
        }else{
            return false;
        }
        return true;
    }

    @Override
    public Boolean saveItem(DictDetail detail) {
        Date date = new Date();
        detail.setCreatedAt(date);
        detail.setUpdatedAt(date);
        detail.setDisabled(false);
        int insert = dictMapper.insertItem(detail);
        if(insert > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateDict(DictMain dictMain) {
        int update = dictMapper.update(dictMain);
        if(update > 0){
            return true;

        }else {
            return false;
        }
    }

    @Override
    public Boolean updateDetail(DictDetail dictDetail) {
        dictDetail.setUpdatedAt(new Date());
        int update = dictMapper.updateItem(dictDetail);
        if(update > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean delMain(String id) {

        // 删除item
        DictMain dictMain = dictMapper.get(id);
        List<DictDetail> itemList = dictMapper.findItemsByName(dictMain.getDictName());
        itemList.forEach( item -> {
            dictMapper.delItem(item.getId());
        });

        // 删除main
        int i = dictMapper.deleteById(id);
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean delItem(String id) {
        int i = dictMapper.delItem(id);
        if(i > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<DictDetail> finItemsByName(String dictName) {
        return dictMapper.findItemsByName(dictName);
    }

    @Override
    public PageInfo<DictMain> queryByPage(Paging page, DictMain dictMain){
        // 执行分页查询
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());

        List<DictMain> list = dictMapper.findList(dictMain);

        return new PageInfo<>(list);
    }
}
