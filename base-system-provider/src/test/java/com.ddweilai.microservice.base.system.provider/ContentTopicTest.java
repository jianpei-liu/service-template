package com.ddweilai.microservice.base.system.provider;

import com.ddweilai.microservice.base.system.api.entity.CommonTag;
import com.ddweilai.microservice.base.system.api.service.ICommonTagService;
import com.ddweilai.microservice.common.api.Paging;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes ={SysProviderApplication.class, ContentTopicTest.class})
public class ContentTopicTest {


    @Autowired
    private ICommonTagService commonTagService;

    @Test
    public void save() {

        CommonTag tag = new CommonTag();


        Paging paging = new Paging(2,2);
        tag.setModule("测试1");

        CommonTag commonTag = this.commonTagService.queryById("2");
    }
}
