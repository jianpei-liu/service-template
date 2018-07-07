package com.ddweilai.microservice.base.system.api.service;


import com.ddweilai.microservice.base.system.api.entity.CommonArea;
import com.ddweilai.microservice.base.system.api.exception.base.BusinessException;
import com.ddweilai.microservice.common.api.Paging;
import com.github.pagehelper.PageInfo;

/**
 * <p>Discription:[省市区/县服务接口]</p>
 * Created on 2018年06月05日
 * @author liu
 */
public interface ICommonAreaService {
 	/**
     * 分页查询
     * @param page
     * @param commonArea
     * @return
     * @throws BusinessException
     */
    PageInfo<CommonArea> queryByPage(Paging page, CommonArea commonArea) throws BusinessException;

	/**
     * 根据条件查询
     * @param commonArea
     * @return
     * @throws BusinessException
     */
	CommonArea selectOneByCondition(CommonArea commonArea);

	/**
     * 根据ID查询
     * @param id
     * @return
     * @throws BusinessException
     */
	CommonArea queryById(String id) throws BusinessException;

	/**
     * 新增
     * @param commonArea
     * @return
     * @throws BusinessException
     */
    CommonArea save(CommonArea commonArea) throws BusinessException;

	/**
     * 更新
     * @param commonArea
     * @return
     * @throws BusinessException
     */
    CommonArea update(CommonArea commonArea) throws BusinessException;

}
