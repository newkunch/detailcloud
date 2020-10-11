package com.yc.springcloud81.bean;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;


@Data //注解 节省getter setter
@Table(name="book") //JPA注解 将java 类关联表
public class Book {
    @Id
    // 注意 对应的数据表中的字段 名叫做book_id
    private Integer bookId;
    private String bookName;
    private String bookAuthor;
    private BigDecimal bookPrice;
    private Date bookDate;
    private Integer userId;

}

