package com.example.demo.web;

import com.example.demo.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
//@RequestMapping(value = "/api")
public  class HelloController {
//
//    @Autowired
//    private Book book;

    @GetMapping("/books/{id}" )
    @ResponseBody
    public Map<String, Object> World(@PathVariable long id) {
        System.out.println("id"+id);
        Map<String,Object> book = new HashMap<>();
        book.put("name","Kiki");
        return null;
    }

    @PostMapping("/book")
    @ResponseBody
    public  Object post(@RequestParam("name") String name){

        return null;
    }


    @RestController
    public static class testController {
        @RequestMapping("/1234" )
        public String hello() {
            return "!!";
        }
        @RequestMapping("/books" )
        public String World() {
            return "book";
        }
    }
}