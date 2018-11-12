package com.zxf.hello.spring.transaction.service.impl;

import com.zxf.hello.spring.transaction.dao.TbContentCategoryDao;
import com.zxf.hello.spring.transaction.dao.TbContentDao;
import com.zxf.hello.spring.transaction.domain.TbContent;
import com.zxf.hello.spring.transaction.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zxf
 * @date 2018/11/11 21:58
 */
@Service
public class TbContentServiceImpl implements TbContentService {

    @Autowired
    private TbContentDao tbContentDao;
    @Override
    public void save(TbContent tbContent) {
        tbContentDao.insert(tbContent);
    }
}
