package com.ddweilai.microservice.base.system.api.entity;

import java.io.Serializable;

/**
 * <p>Discription:[省市区/县实体类]</p>
 * Created on 2018年06月05日
 * @author liu
 */
public class CommonArea implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String id;
	/**
	 * 父id
	 */
	private Integer parentId;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 简称
	 */
	private String shortName;
	/**
	 * 类型：1.省；2.市；3.县
	 */
	private Boolean type;
	/**
	 * 代码
	 */
	private String code;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 删除标志
	 */
	private Boolean delFlag;
	/**
	 * 创建人id
	 */
	private Integer createdId;
	/**
	 * 创建人名字
	 */
	private String createdName;
	/**
	 * 创建时间
	 */
	private java.util.Date createdAt;
	/**
	 * 最后一次修改人id
	 */
	private Integer updatedId;
	/**
	 * 最后一次更新时间
	 */
	private java.util.Date updatedAt;
	/**
	 * 经度
	 */
	private java.math.BigDecimal longitude;
	/**
	 * 纬度
	 */
	private java.math.BigDecimal latitude;
	
	// setter and getter
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public Integer getParentId(){
		return parentId;
	}
	
	public void setParentId(Integer parentId){
		this.parentId = parentId;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getShortName(){
		return shortName;
	}
	
	public void setShortName(String shortName){
		this.shortName = shortName;
	}
	public Boolean getType(){
		return type;
	}
	
	public void setType(Boolean type){
		this.type = type;
	}
	public String getCode(){
		return code;
	}
	
	public void setCode(String code){
		this.code = code;
	}
	public Integer getSort(){
		return sort;
	}
	
	public void setSort(Integer sort){
		this.sort = sort;
	}
	public Boolean getDelFlag(){
		return delFlag;
	}
	
	public void setDelFlag(Boolean delFlag){
		this.delFlag = delFlag;
	}
	public Integer getCreatedId(){
		return createdId;
	}
	
	public void setCreatedId(Integer createdId){
		this.createdId = createdId;
	}
	public String getCreatedName(){
		return createdName;
	}
	
	public void setCreatedName(String createdName){
		this.createdName = createdName;
	}
	public java.util.Date getCreatedAt(){
		return createdAt;
	}
	
	public void setCreatedAt(java.util.Date createdAt){
		this.createdAt = createdAt;
	}
	public Integer getUpdatedId(){
		return updatedId;
	}
	
	public void setUpdatedId(Integer updatedId){
		this.updatedId = updatedId;
	}
	public java.util.Date getUpdatedAt(){
		return updatedAt;
	}
	
	public void setUpdatedAt(java.util.Date updatedAt){
		this.updatedAt = updatedAt;
	}
	public java.math.BigDecimal getLongitude(){
		return longitude;
	}
	
	public void setLongitude(java.math.BigDecimal longitude){
		this.longitude = longitude;
	}
	public java.math.BigDecimal getLatitude(){
		return latitude;
	}
	
	public void setLatitude(java.math.BigDecimal latitude){
		this.latitude = latitude;
	}
}
