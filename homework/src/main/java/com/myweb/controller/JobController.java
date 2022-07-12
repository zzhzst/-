package com.myweb.controller;

import com.myweb.mapper.JobInfoExtMapper;
import com.myweb.pojo.JobInfoExt;
import com.myweb.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/job")
public class JobController {
    @Autowired
    private JobService jobService;

    //查询职位，默认全部查出来
    //这里是连接查询，新建了一个类jobinfoext用来存储信息
    @RequestMapping("findAllJob")
    public String findAllJob(String jobName, String jobAddress, String companyName, Model model) {
        Map<String, Object> map = new HashMap<>();
        map.put("jobName", jobName);
        map.put("companyName", companyName);
        map.put("jobAddress", jobAddress);
        List<JobInfoExt> jobInfoList = jobService.findAll(map);
        model.addAttribute("jobInfoList", jobInfoList);
        return "/job/listAllJob";
    }

}
