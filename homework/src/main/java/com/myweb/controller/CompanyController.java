package com.myweb.controller;

import com.myweb.commons.pojo.Message;
import com.myweb.pojo.Company;
import com.myweb.pojo.Job;
import com.myweb.service.CompanyService;
import com.myweb.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/com")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @Autowired
    JobService jobService;

    // 企业注册
    @RequestMapping("/registCom")
    @ResponseBody
    public Message registCom(Company company) {
        Message msg = new Message();
        Company company1 = companyService.findCompanyByName(company.getCompanyLoginName());//获得公司登录名去数据库中查询
        if (company1 != null) {//公司登录名已经存在
            msg.setStr("公司登录名已经存在");
            return msg;
        } else {
            Company company2 = companyService.findByCompanyName(company.getCompanyName());    //判断公司名称是否唯一
            if (company2 != null) {
                msg.setStr("公司名已经存在");
                return msg;
            } else {
                //公司名字也没被注册
                companyService.insert(company);//插入具体数据
                msg.setStr("success");
                return msg;
            }
        }
    }

    //企业登录
    @RequestMapping("/accessComLogin")
    @ResponseBody
    public Message accessComLogin(HttpServletRequest request, String companyLoginName, String companyPwd, Model model) {
        Company currCom = companyService.getCompanyByNameAndPwd(companyLoginName, companyPwd);//根据登录名向数据库中查询用户
        Message msg = new Message();
        if (currCom == null) {
            msg.setStr("fail");
            return msg;
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("currCom", currCom);
            msg.setStr("success");
            return msg;
        }
    }

    //跳转到企业首页
    @RequestMapping("index")
    public String index() {
        return "/company/index";
    }

    //退出登录
    @RequestMapping(value = "/exit")
    public String exit(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //退出时清空session
        request.getSession().removeAttribute("currCom");
        return "/company/login";
    }

    //后台的三个界面
    @RequestMapping("/top")
    public String toTop() {
        return "/company/top";
    }

    @RequestMapping("/left")
    public String toLeft() {
        return "/company/left";
    }

    @RequestMapping("/body")
    public String toBody() {
        return "/company/body";
    }

    //跳转到添加职位页面
    @RequestMapping("/toAddPost")
    public String toAddPost(Model model) {
        return "/company/addPost";
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

    //展示企业的详细信息
    @RequestMapping("/show")
    public String show(Integer cid, String jobName, String jobAddress, String releaseTime, Double jobSalary, String companyName, Model model) {
        System.out.println(jobName);
        Company company = companyService.findCompanyById(cid);
        model.addAttribute("jobName", jobName);
        model.addAttribute("jobAddress", jobAddress);
        model.addAttribute("releaseTime", releaseTime);
        model.addAttribute("jobSalary", jobSalary);
        model.addAttribute("companyName", companyName);
        model.addAttribute("company", company);
        return "/job/showOneCompany";
    }
}
