package com.ddweilai.microservice.base.system.provider.serviceimpl;

import com.ddweilai.microservice.base.system.api.entity.CommonArea;
import com.ddweilai.microservice.base.system.api.exception.base.BusinessException;
import com.ddweilai.microservice.base.system.api.service.ICommonAreaService;
import com.ddweilai.microservice.base.system.provider.mapper.CommonAreaMapper;
import com.ddweilai.microservice.common.api.Paging;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>Discription:[省市区/县服务接口实现类]</p>
 * Created on 2018年06月05日
 * @author liu
 */
@Service("commonAreaService")
public class CommonAreaServiceImpl implements ICommonAreaService {
	@Resource
	private CommonAreaMapper commonAreaMapper;

    @Override
    public PageInfo<CommonArea> queryByPage(Paging page, CommonArea commonArea) throws BusinessException {
        // 执行分页查询
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());
        List<CommonArea> list = commonAreaMapper.findList(commonArea);
        return new PageInfo<>(list);
    }

    @Override
    public CommonArea selectOneByCondition(CommonArea commonArea) {
        return commonAreaMapper.selectOneByCondition(commonArea);
    }

    @Override
    public CommonArea queryById(String id) throws BusinessException {
        CommonArea commonArea = commonAreaMapper.get(id);
        return commonArea;
    }

    @Override
    public CommonArea save(CommonArea commonArea) throws BusinessException{
        commonAreaMapper.insert(commonArea);
        return commonArea;
    }

    @Override
    public CommonArea update(CommonArea commonArea) throws BusinessException{
        commonAreaMapper.update(commonArea);
        return commonArea;
    }

}