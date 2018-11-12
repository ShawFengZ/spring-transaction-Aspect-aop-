package com.zxf.hello.spring.transaction.domain;


import com.sun.istack.internal.NotNull;
import lombok.Data;

import java.util.Date;

/**
 * @author zxf
 * @date 2018/11/7 16:06
 */
@Data
public class TbContentCategory  {
    private Long id;
    private String name;
    private Integer status;
    private Integer sortOrder;
    private Boolean isParent;
    private TbContentCategory parent;
    private Date updated;
    private Date created;
}
