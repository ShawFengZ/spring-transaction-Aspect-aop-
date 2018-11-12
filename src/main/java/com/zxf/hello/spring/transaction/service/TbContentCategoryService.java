package com.zxf.hello.spring.transaction.service;

import com.zxf.hello.spring.transaction.domain.TbContent;
import com.zxf.hello.spring.transaction.domain.TbContentCategory;

/**
 * @author zxf
 * @date 2018/11/11 21:57
 */
public interface TbContentCategoryService {
    public void save(TbContentCategory tbContentCategory, TbContent tbContent);
}
