package com.myweb.controller;

import com.myweb.pojo.Eboard;
import com.myweb.service.EboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/eboard")
public class EboardController {
    @Autowired
    EboardService eboardService;

    //查看所有新闻和公告
    @RequestMapping("/showNews")
    public String showJournalism(Model model){
        List<Eboard> eboardList = eboardService.findAllJournalism();
        model.addAttribute("eboardList", eboardList);
        return "/main/listEboard";
    }
}
