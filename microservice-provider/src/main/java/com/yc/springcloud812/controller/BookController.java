package com.yc.springcloud812.controller;





import com.yc.springcloud81.bean.Book;
import com.yc.springcloud812.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Book")
public class BookController {

    @Autowired(required = false)
    //注入service
    private BookService bookService;

    //rest 风格参数
    @GetMapping("{id}")
    public Book getBook(@PathVariable("id")Integer id){
            return  bookService.getBook(id);
    }

    @GetMapping("findAll")
    public List<Book> findAll(){
        return this.bookService.findAll();
    }


}
