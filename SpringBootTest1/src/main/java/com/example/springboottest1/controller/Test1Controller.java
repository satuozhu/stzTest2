package com.example.springboottest1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author：Lucas
 * @date: 2022/11/5 10:10
 * @description: some description
 */
@Controller
@RequestMapping("/boot")
public class Test1Controller {


    @RequestMapping("/test1")
    @ResponseBody
    public String hello(){
        return "hello springboot test";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String hello2(){
        return "hello springboot test2";
    }
    @RequestMapping("/test3")
    @ResponseBody
    public String hello3(){
        return "hello springboot test3";
    }
    @RequestMapping("/test4")
    @ResponseBody
    public String hello4(){
        return "hello springboot test4";
    }
    @RequestMapping("/test5")
    @ResponseBody
    public String hello5(){
        return "hello springboot test5";
    }
}
