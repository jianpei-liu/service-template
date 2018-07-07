package com.ddweilai.microservice.base.system.api.entity;

import lombok.Data;
import java.io.Serializable;

/**
 * <p>Discription:[标签实体类]</p>
 * Created on 2018年06月10日
 * @author liu
 */
@Data
public class CommonTag implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String id;
	/**
	 * tag名称
	 */
	private String tagName;
	/**
	 * 唯一标示
	 */
	private String tagIdentify;
	/**
	 * 模块
	 */
	private String module;
	/**
	 * 所属id
	 */
	private Integer thirdId;
	/**
	 * 删除标示：1否，2是
	 */
	private Integer delFlag;
	/**
	 * 创建人
	 */
	private Integer createdId;
	/**
	 * 创建时间
	 */
	private java.util.Date createdAt;
	/**
	 * 最后更新人
	 */
	private Integer updatedId;
	/**
	 * 最后更新时间
	 */
	private java.util.Date updatedAt;
	

}
