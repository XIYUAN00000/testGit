package org.example.test202402252008git.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 被这个注解修饰的类是控制器
public class HelloConrtoller  {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
