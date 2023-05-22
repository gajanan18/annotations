package com.test.flyway.api;

import com.test.flyway.model.entity.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @RequestMapping("/hello-spring")
    public String helloSpring(){
        return "HelloSpring";
    }


    @RequestMapping(value = {"/book","/test-book"})//we can use either URI endpoints to call api not all (localhost:7008/flyway/book OR localhost:7008/flyway/test-book)
    public Book getBook(){
        return  new Book(1,"test","springBook");
    }


}
