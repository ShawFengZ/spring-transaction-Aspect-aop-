package com.zxf.hello.spring.transaction.domain;

import lombok.Data;

import java.util.Date;

/**
 * 内容管理
 * @author zxf
 * @date 2018/11/8 9:30
 */
@Data
public class TbContent{

    private Long id;
    private String title;
    private String subTitle;
    private String titleDesc;
    private String url;
    private String pic;
    private String pic2;
    private String content;
    private TbContentCategory tbContentCategory;
    private Date updated;
    private Date created;
}
