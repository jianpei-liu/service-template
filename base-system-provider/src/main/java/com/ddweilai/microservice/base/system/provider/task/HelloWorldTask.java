package com.ddweilai.microservice.base.system.provider.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by chenll on 2017/12/7.
 */
@Component
public class HelloWorldTask {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldTask.class);
    /**
     * 每小时执行
     */
    @Scheduled(cron = "0 0 0/1 * * ? ")
    public void executeHello(){
        logger.info("hello task");
    }
}
