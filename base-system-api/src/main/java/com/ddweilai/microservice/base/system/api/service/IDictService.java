package com.ddweilai.microservice.base.system.api.service;

import com.ddweilai.microservice.common.api.Paging;
import com.ddweilai.microservice.base.system.api.entity.DictDetail;
import com.ddweilai.microservice.base.system.api.entity.DictMain;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface IDictService {

    Map<String, Map<String, String>> getCache();

    Boolean saveDict(DictMain dictMain);

    Boolean saveItem(DictDetail detail);

    Boolean updateDict(DictMain dictMain);

    Boolean updateDetail(DictDetail dictDetail);

    Boolean delMain(String id);

    Boolean delItem(String id);

    List<DictDetail> finItemsByName(String dictName);

    PageInfo<DictMain> queryByPage(Paging page, DictMain dictMain);
}
