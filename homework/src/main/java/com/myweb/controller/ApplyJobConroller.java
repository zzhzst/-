package com.myweb.controller;

import com.myweb.commons.pojo.Message;
import com.myweb.pojo.Apply;
import com.myweb.pojo.Company;
import com.myweb.service.ApplyJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/apply")
public class ApplyJobConroller {

    @Autowired
    ApplyJobService applyJobService;

    //根据企业名查找所有的申请者
    @RequestMapping("/findApply")
    public String findAllApply(String companyName, Model model, HttpServletRequest request) {
        Company company = (Company) request.getSession().getAttribute("currCom");
        String currCompanyName = company.getCompanyName();
        List<Apply> applyList = applyJobService.findAllByCompanyName(currCompanyName);
        model.addAttribute("applyList", applyList);
        return "/apply/showApply";
    }

    //申请职位
    @RequestMapping("/accpet")
    @ResponseBody
    public Message accpet(String jobName, String jobAddress, String releaseTime,
                          String realname, Double jobSalary, String companyName) {
        Message message = new Message();
        if (realname == null || realname.isEmpty()) {//判断用户是否登录
            message.setStr("您还没有登录！");
            return message;
        }
        Apply apply = applyJobService.findApplyByAll(realname, jobAddress, jobName);
        if (apply == null) {
            //插入职位具体数据
            Apply apply_ = new Apply();
            apply_.setJobAddress(jobAddress);
            apply_.setJobName(jobName);
            apply_.setJobSalary(jobSalary);
            apply_.setRealname(realname);
            apply_.setReleaseTime(releaseTime);
            apply_.setCompanyName(companyName);
            int result = applyJobService.insertApply(apply_);
            if (result == 1) {
                message.setStr("投递成功！");
                return message;
            } else {
                message.setStr("不好意思，投递失败！");
                return message;
            }
        } else {
            //第二次申请
            message.setStr("请不要重复投递！");
            return message;
        }
    }

    //查询职位投递记录
    @RequestMapping("/applyRecord")
    public String findApplyByRealName(String realname,Model model){
        List<Apply> applyList_ = applyJobService.findApplyRecordByRealname(realname);
        model.addAttribute("applyList_", applyList_);
        return "/apply/showApplyRecord";
    }

    //查询职位投递个数
    @RequestMapping("/countApplyNumber")
    @ResponseBody
    public void countApplyNumber(HttpSession session){
        int applyNumber = applyJobService.countApplyNumber();
        session.setAttribute("applyNumber",applyNumber);
    }
}
