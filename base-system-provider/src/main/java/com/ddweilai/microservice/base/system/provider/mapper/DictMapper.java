package com.ddweilai.microservice.base.system.provider.mapper;

import com.ddweilai.microservice.base.system.api.entity.DictDetail;
import com.ddweilai.microservice.base.system.api.entity.DictMain;
import com.ddweilai.microservice.common.service.dao.CrudDao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DictMapper extends CrudDao<DictMain> {

    List<DictMain> getCache();

    int insertItem(DictDetail detail);

    int updateItem(DictDetail detail);

    List<DictDetail> findItemsByName(@Param("dictName") String dictName);

    int delItem(@Param("id") String id);

}
