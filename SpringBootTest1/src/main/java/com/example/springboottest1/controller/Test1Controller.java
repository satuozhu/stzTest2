package com.example.springboottest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：Lucas
 * @date: 2022/11/5 10:10
 * @description: some description
 */
@RestController
@RequestMapping("/boot")
public class Test1Controller {


    @RequestMapping("/test1")
    public String hello(){
        return "hello springboot test";
    }

    @RequestMapping("/test2")
    public String hello2(){
        return "hello springboot test2";
    }
    @RequestMapping("/test3")
    public String hello3(){
        return "hello springboot test3";
    }
    
}
