package com.zxf.hello.spring.transaction.dao;

import com.zxf.hello.spring.transaction.domain.TbContent;
import org.springframework.stereotype.Repository;

/**
 * @author zxf
 * @date 2018/11/11 21:55
 */
@Repository
public interface TbContentDao {
    public void insert(TbContent tbContent);
}
