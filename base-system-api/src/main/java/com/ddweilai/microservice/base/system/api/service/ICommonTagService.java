package com.ddweilai.microservice.base.system.api.service;

import com.ddweilai.microservice.base.system.api.entity.CommonTag;
import com.ddweilai.microservice.base.system.api.exception.base.BusinessException;
import com.ddweilai.microservice.common.api.Paging;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * <p>Discription:[标签服务接口]</p>
 * Created on 2018年06月10日
 * @author liu
 */
public interface ICommonTagService {

 	/**
     * 分页查询
     * @param page
     * @param commonTag
     * @return
     * @throws BusinessException
     */
    PageInfo<CommonTag> queryByPage(Paging page, CommonTag commonTag) throws BusinessException;
	
	/**
     * 根据条件查询one
     * @param commonTag
     * @return
     * @throws BusinessException
     */
	CommonTag selectOneByCondition(CommonTag commonTag);

    /**
     * 根据条件查询所有
     * @param commonTag
     * @return
     * @throws BusinessException
     */
    List<CommonTag> findAllByCondition(CommonTag commonTag);

	/**
     * 查询所有
     * @param
     * @return
     * @throws BusinessException
     */
    List<CommonTag> findAll() throws BusinessException;

	/**
     * 根据ID查询
     * @param id
     * @return
     * @throws BusinessException
     */
	CommonTag queryById(String id) throws BusinessException;

	/**
     * 新增
     * @param commonTag
     * @return
     * @throws BusinessException
     */
    boolean save(CommonTag commonTag) throws BusinessException;

	/**
     * 更新
     * @param commonTag
     * @return
     * @throws BusinessException
     */
    boolean update(CommonTag commonTag) throws BusinessException;

	/**
     * 根据ID删除
     * @param id
     * @return
     * @throws BusinessException
     */
    boolean deleteById(String id) throws BusinessException;

}
