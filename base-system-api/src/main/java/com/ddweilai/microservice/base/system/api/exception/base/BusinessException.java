package com.ddweilai.microservice.base.system.api.exception.base;

/**
 * 业务异常.
 *
 * @author zhangxd
 */
public class BusinessException extends RuntimeException {

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

}