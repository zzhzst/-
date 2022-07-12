package com.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    //跳转到项目的主页面
    @RequestMapping("/")
    public String toIndex() {
        return "/main/index";
    }
}
