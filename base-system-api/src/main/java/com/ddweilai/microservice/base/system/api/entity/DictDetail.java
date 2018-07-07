package com.ddweilai.microservice.base.system.api.entity;


import com.ddweilai.microservice.common.api.DataEntity;

import javax.validation.constraints.NotNull;

public class DictDetail extends DataEntity {

    // 字典名
    @NotNull(message = "字典名称不能为空")
    private String dictName;

    // 字典项名
    @NotNull(message = "字典项名不能为空")
    private String detailName;

    // 字典项备注
    private String detailContent ;

    // 顺序
    private Integer detailSeq ;

    // 是否禁用：1是，0否
    private Boolean disabled ;

    private String createdUserId;

    private String createdUserName;

    private String updatedUserId;


    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public String getDetailContent() {
        return detailContent;
    }

    public void setDetailContent(String detailContent) {
        this.detailContent = detailContent;
    }

    public Integer getDetailSeq() {
        if(detailSeq == null){
            detailSeq = 0;
        }
        return detailSeq;
    }

    public void setDetailSeq(Integer detailSeq) {
        this.detailSeq = detailSeq;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
    }

    public String getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(String updatedUserId) {
        this.updatedUserId = updatedUserId;
    }
}
