package com.myweb.controller;

import com.myweb.commons.pojo.Message;
import com.myweb.pojo.Company;
import com.myweb.pojo.Job;
import com.myweb.pojo.JobInfoExt;
import com.myweb.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    @RequestMapping("/findAllJob")
    public String findAllJob(String jobName, String jobAddress, String companyName, Model model) {
        Map<String, Object> map = new HashMap<>();
        map.put("jobName", jobName);
        map.put("companyName", companyName);
        map.put("jobAddress", jobAddress);
        List<JobInfoExt> jobInfoList = jobService.findAll(map);
        model.addAttribute("jobInfoList", jobInfoList);
        return "/job/listAllJob";
    }

    //查询一家公司对应上架的职位
    @RequestMapping("/tofindJobByCom")
    public String findJobByCom(HttpServletRequest request,Model model){
        Company company = (Company) request.getSession().getAttribute("currCom");
        Integer cid = company.getCid();
        List<Job> jobList = jobService.findJobByCom(cid);
        model.addAttribute("jobList",jobList);
        return "/job/companyJob";
    }

    //跳转到添加职位页面
    @RequestMapping("/toAddPost")
    public String toAddPost(Model model) {
        return "/job/addPost";
    }

    //添加职位
    @RequestMapping("/addPost")
    @ResponseBody
    public Message addPost(HttpServletRequest request, String jobName, String jobAddress, Double jobSalary,
                           String releaseTime, Integer cid) {
        Message msg = new Message();
        Company company = (Company) request.getSession().getAttribute("currCom");
        if (company != null) {
            Job job = jobService.findByCidAndJobName(cid, jobName);
            if (job == null) {
                //将数据封装到新的job对象，插入数据库
                Job job_ = new Job();
                job_.setCid(String.valueOf(cid));
                job_.setJobAddress(jobAddress);
                job_.setJobName(jobName);
                job_.setJobSalary(jobSalary);
                job_.setReleaseTime(releaseTime);
                int result = jobService.insertJob(job_);
                if (result == 1) {
                    msg.setStr("success");
                    return msg;
                } else {
                    msg.setStr("插入职位失败");
                    return msg;
                }
            } else {
                //不可以
                msg.setStr("新增的职位名称不可以重复");
                return msg;
            }
        } else {
            msg.setStr("fail");
            return msg;
        }
    }

    //删除职位
    @RequestMapping("/deleteJobById")
    public String deleteJobById(Integer jobId) {
        int num = jobService.deleteJobById(jobId);
         return "redirect:/job/tofindJobByCom";
    }

    @RequestMapping("/countJobNumber")
    @ResponseBody
    public void countJobNumber(HttpSession session){
        int jobNumber = jobService.countJobNumber();
        session.setAttribute("jobNumber",jobNumber);
    }
}
