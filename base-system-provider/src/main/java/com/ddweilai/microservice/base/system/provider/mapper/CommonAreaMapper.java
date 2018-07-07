package com.ddweilai.microservice.base.system.provider.mapper;


import com.ddweilai.microservice.base.system.api.entity.CommonArea;
import com.ddweilai.microservice.common.service.dao.CrudDao;
import org.apache.ibatis.annotations.Mapper;


/**
 * <p>Discription:[省市区/县DAO接口]</p>
 * Created on 2018年06月05日
 * @author liu
 */
@Mapper
public interface CommonAreaMapper extends CrudDao<CommonArea> {
	
}
