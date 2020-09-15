package com.example.demo.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public  class HelloController {

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