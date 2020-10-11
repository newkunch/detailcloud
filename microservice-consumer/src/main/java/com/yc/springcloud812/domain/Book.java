package com.yc.springcloud812.domain;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;


@Data //注解 节省getter setter

public class Book {

    // 注意 对应的数据表中的字段 名叫做book_id
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private BigDecimal bookPrice;
    private Date bookDate;
    private Integer userId;

}

