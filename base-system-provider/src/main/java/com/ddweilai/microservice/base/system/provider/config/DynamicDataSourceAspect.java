package com.ddweilai.microservice.base.system.provider.config;

import com.ddweilai.microservice.common.service.datasource.DynamicDataSourceHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 切换数据源Advice
 */
@Aspect
@Component
@Slf4j
public class DynamicDataSourceAspect {

    @Before("@annotation(ds)")
    public void changeDataSource(JoinPoint point, TargetDataSource ds) throws Throwable {
        String dsId = ds.name();
        if (!DynamicDataSourceHolder.containsDataSource(dsId)) {
            log.error("数据源[{}]不存在，使用默认数据源 > {}", ds.name(), point.getSignature());
        } else {
            log.debug("Use DataSource : {} > {}", ds.name(), point.getSignature());
            DynamicDataSourceHolder.putDataSource(ds.name());
        }
    }

    @After("@annotation(ds)")
    public void restoreDataSource(JoinPoint point, TargetDataSource ds) {
        log.debug("Revert DataSource : {} > {}", ds.name(), point.getSignature());
        DynamicDataSourceHolder.clearDataSource();
    }

}