package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "person")
public class DemoController {

    private String name;
    private Integer age;

    @RequestMapping("/quickApplication")
    @ResponseBody
    public String quickApplication(){
        return "spring 访问成功 name="+name+",age="+age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }

}
