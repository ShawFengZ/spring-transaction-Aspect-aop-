package com.zxf.hello.spring.transaction.service.impl;

import com.zxf.hello.spring.transaction.dao.TbContentCategoryDao;
import com.zxf.hello.spring.transaction.domain.TbContent;
import com.zxf.hello.spring.transaction.domain.TbContentCategory;
import com.zxf.hello.spring.transaction.service.TbContentCategoryService;
import com.zxf.hello.spring.transaction.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zxf
 * @date 2018/11/11 21:59
 */
@Service
@Transactional(readOnly = true)
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Autowired
    private TbContentCategoryDao tbContentCategoryDao;

    @Autowired
    private TbContentService tbContentService;

    @Override
    @Transactional(readOnly = false)
    public void save(TbContentCategory tbContentCategory, TbContent tbContent) {
        tbContentCategoryDao.insert(tbContentCategory);

        if (true) {
            throw new RuntimeException();
        }
        tbContentService.save(tbContent);
    }
}
