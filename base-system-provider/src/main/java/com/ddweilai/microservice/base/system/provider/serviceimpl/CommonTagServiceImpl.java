package com.ddweilai.microservice.base.system.provider.serviceimpl;

import com.ddweilai.microservice.base.system.api.entity.CommonTag;
import com.ddweilai.microservice.base.system.api.exception.base.BusinessException;
import com.ddweilai.microservice.base.system.api.service.ICommonTagService;
import com.ddweilai.microservice.base.system.provider.mapper.CommonTagMapper;
import com.ddweilai.microservice.common.api.Paging;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>Discription:[标签服务接口实现类]</p>
 * Created on 2018年06月10日
 * @author liu
 */
@Service("commonTagService")
public class CommonTagServiceImpl implements ICommonTagService {

	@Resource
	private CommonTagMapper commonTagMapper;

    @Override
    public PageInfo<CommonTag> queryByPage(Paging page, CommonTag commonTag) throws BusinessException {
        // 执行分页查询
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());
        List<CommonTag> list = commonTagMapper.findList(commonTag);
        return new PageInfo<>(list);
    }

    @Override
    public CommonTag selectOneByCondition(CommonTag commonTag) throws BusinessException {
        return commonTagMapper.selectOneByCondition(commonTag);
    }

    @Override
    public List<CommonTag> findAllByCondition(CommonTag commonTag) throws BusinessException {
        List<CommonTag> list = commonTagMapper.findList(commonTag);
        return list;
    }

    @Override
    public List<CommonTag> findAll() throws BusinessException {
        List<CommonTag> allList = commonTagMapper.findList(new CommonTag());
        return allList;
    }

    @Override
    public CommonTag queryById(String id) throws BusinessException {
        CommonTag commonTag = commonTagMapper.get(id);
        return commonTag;
    }

    @Override
    public boolean save(CommonTag commonTag) throws BusinessException{
        return commonTagMapper.insert(commonTag) > 0;
    }

    @Override
    public boolean update(CommonTag commonTag) throws BusinessException{
        return commonTagMapper.update(commonTag) > 0;
    }

    @Override
    public boolean deleteById(String id) throws BusinessException {
        CommonTag commonTag = new CommonTag();
        commonTag.setId(id);
        commonTag.setDelFlag(2);
        return commonTagMapper.update(commonTag) > 0;
    }

}