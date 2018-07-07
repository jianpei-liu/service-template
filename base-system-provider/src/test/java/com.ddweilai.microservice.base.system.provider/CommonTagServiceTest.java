package com.ddweilai.microservice.base.system.provider;


import com.ddweilai.microservice.base.system.api.entity.CommonTag;
import com.ddweilai.microservice.base.system.api.service.ICommonTagService;
import com.ddweilai.microservice.common.api.Paging;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.util.List;

/** 
 * Description: [标签的单元测试]
 * Created on 2018年06月10日
 * @author  liu
 * @version 1.0 
 * Copyright (c) 2018年
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CommonTagServiceTest{

	@Autowired
	private ICommonTagService commonTagService;

	@Test
	public void queryByPageTest(){
		Paging paging = new Paging(2,2);
		CommonTag commonTag = new CommonTag();

		PageInfo<CommonTag> info = this.commonTagService.queryByPage(paging, commonTag);

	}
	
	@Test
	public void selectOneByConditionTest(){
		CommonTag commonTag = new CommonTag();

		CommonTag result = this.commonTagService.selectOneByCondition(commonTag);
		Assert.notNull(result, "条件查找一个成功！");
	}

	@Test
	public void findAllByConditionTest(){
		CommonTag commonTag = new CommonTag();

		List<CommonTag> list = this.commonTagService.findAllByCondition(commonTag);
		Assert.notEmpty(list, "条件查找全部结果不为空！");
	}

	@Test
	public void findAllTest(){
		List<CommonTag> list = this.commonTagService.findAll();
		Assert.notEmpty(list, "查找全部结果不为空！");
	}

	@Test
	public void queryByIdTest(){
		CommonTag result = this.commonTagService.queryById("627");
		Assert.notNull(result, "根据id查找成功！");
	}

	@Test
	public void saveTest(){
		CommonTag commonTag = new CommonTag();

		boolean result = this.commonTagService.save(commonTag);
		Assert.isTrue(result, "保存成功！");
	}

	@Test
	public void updateTest(){
		CommonTag commonTag = new CommonTag();

		boolean result = this.commonTagService.update(commonTag);
		Assert.isTrue(result, "更新成功！");
	}

	@Test
	public void deleteByIdTest(){
	}


}