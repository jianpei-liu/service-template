package com.ddweilai.microservice.base.system.api.entity;


import com.ddweilai.microservice.common.api.DataEntity;

import javax.validation.constraints.NotNull;
import java.util.List;

public class DictMain extends DataEntity {

    // 字典名
    @NotNull(message = "字典名称不能为空")
    private String dictName;

    // 字典备注
    private String dictContent ;

    // 是否禁用：1是，0否
    private Boolean disabled ;


    private String createdUserId;

    private String createdUserName;

    private String updatedUserId;

    private List<DictDetail> details;

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictContent() {
        return dictContent;
    }

    public void setDictContent(String dictContent) {
        this.dictContent = dictContent;
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

    public List<DictDetail> getDetails() {
        return details;
    }

    public void setDetails(List<DictDetail> details) {
        this.details = details;
    }
}
