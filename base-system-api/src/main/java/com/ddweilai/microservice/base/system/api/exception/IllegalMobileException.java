package com.ddweilai.microservice.base.system.api.exception;


import com.ddweilai.microservice.base.system.api.exception.base.BusinessException;

/**
 * 手机号码不合法
 *
 * @author zhangxd
 */
public class IllegalMobileException extends BusinessException {

    public IllegalMobileException(String message) {
        super(message);
    }

}
