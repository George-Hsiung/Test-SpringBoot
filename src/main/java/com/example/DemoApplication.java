package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

//    @Value(value = "${book.author}")
//    private String bookAuthor;
//    @Value("${book.name}")
//    private String bookName;
//    @Value("${book.pinyin}")
//    private String bookPinYin;

    @Autowired
    private BookBean bookBean;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping(value="/",produces = "text/plain;charset=UTF-8")
    String index(){
        //return "Hello Spring Boot! The BookName is "+bookName+";and Book Author is "+bookAuthor+";and Book PinYin is "+bookPinYin;
        return null;
    }

    @RequestMapping("/book")
    public String book() {
        return "Hello Spring Boot! The BookName is "+bookBean.getName()+";and Book Author is "+bookBean.getAuthor()+";and Book price is "+bookBean.getPrice();
    }
}
