package com.ddweilai.microservice.base.system.provider.mapper;

import com.ddweilai.microservice.base.system.api.entity.CommonTag;
import com.ddweilai.microservice.common.service.dao.CrudDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>Discription:[标签DAO接口]</p>
 * Created on 2018年06月10日
 * @author liu
 */
 
@Mapper
public interface CommonTagMapper extends CrudDao<CommonTag> {
	
}
