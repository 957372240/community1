package com.hao.community.controller;

import com.hao.community.service.AlphaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/alpha")
public class AlphaController {
    @Autowired
    private AlphaService alphaService;
    @RequestMapping("/get")
    @ResponseBody
    public String getData(){
        return alphaService.find();
    }
    @RequestMapping("/hello")
    @ResponseBody
    public String satHello(){
        return "hello Spring Boot";
    }

}
