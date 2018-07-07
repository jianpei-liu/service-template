package com.ddweilai.microservice.base.system.provider;

import com.ddweilai.microservice.base.system.provider.config.DynamicDataSourceRegister;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.io.IOException;
/**
 * Spring-boot 启动入口
 *
 * @author zhangxd
 */
@RestController
@EnableScheduling
@SpringBootApplication
@EnableTransactionManagement
@Import({DynamicDataSourceRegister.class})
@EnableSwagger2

@ImportResource("classpath:dubbo-provider.xml")
public class SysProviderApplication {

    /**
     * Logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(SysProviderApplication.class);




    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException {
        SpringApplication application = new SpringApplication(SysProviderApplication.class);
        application.setRegisterShutdownHook(false);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
        LOGGER.info("BASE Service provider started!!!");
    }


    /**
     * Hello string.
     *
     * @return the string
     */
    @RequestMapping
    public String hello() {
        return "Hello World!";
    }
}
