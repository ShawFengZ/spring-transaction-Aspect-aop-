package com.zxf.hello.spring.transaction.service;

import com.zxf.hello.spring.transaction.domain.TbContent;
import com.zxf.hello.spring.transaction.domain.TbContentCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class TbContentCategoryServiceTest {

    @Autowired
    private TbContentCategoryService tbContentCategoryService;
    @Test
    public void save() {
        TbContentCategory tbContentCategory = new TbContentCategory();
        tbContentCategory.setId(1L);
        tbContentCategory.setName("测试分类");

        TbContent tbContent = new TbContent();
        tbContent.setTbContentCategory(tbContentCategory);
        tbContent.setContent("测试内容");

        tbContentCategoryService.save(tbContentCategory, tbContent);
    }
}