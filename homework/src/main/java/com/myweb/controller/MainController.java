package com.myweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
public class MainController {

    //跳转到项目的主页面
    @RequestMapping("/index")
    public String toIndex() {
        return "/main/index";
    }

    //主界面上方的top界面
    @RequestMapping("/top")
    public String toTop() {
        return "/main/top";
    }

    //主界面上方的left界面
    @RequestMapping("/left")
    public String toLeft() {
        return "/main/left";
    }

    //主界面上的主界面
    @RequestMapping("/body")
    public String toBody() {
        return "/main/body";
    }

    //跳转到企业注册的页面
    @RequestMapping("/registCom")
    public String toRegistCom() {
        return "/company/registCom";
    }

    //企业登录的页面
    @RequestMapping("/companyLogin")
    public String comlogin(Model model) {
        return "/company/login";
    }

    //跳转到用户注册的页面
    @RequestMapping("/registUser")
    public String toRegistUser() {
        return "/user/registUser";
    }

    //跳转到用户登录界面
    @RequestMapping("/userLogin")
    public String login(Model model) {
        return "/user/login";
    }

}
