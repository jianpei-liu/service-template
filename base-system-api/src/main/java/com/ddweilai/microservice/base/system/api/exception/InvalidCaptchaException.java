package com.ddweilai.microservice.base.system.api.exception;


import com.ddweilai.microservice.base.system.api.exception.base.BusinessException;

/**
 * 无效验证码
 *
 * @author zhangxd
 */
public class InvalidCaptchaException extends BusinessException {

    public InvalidCaptchaException(String message) {
        super(message);
    }

}
