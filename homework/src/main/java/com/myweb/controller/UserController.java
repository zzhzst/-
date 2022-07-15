package com.myweb.controller;

import com.myweb.commons.pojo.Message;
import com.myweb.pojo.User;
import com.myweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    //注册用户
    @RequestMapping("/registUser")
    @ResponseBody
    public Message registUser(User user) {
        Message msg = new Message();
        //根据登录名来判断
        User user1 = userService.findByUserLoginName(user.getLoginName());
        if (user1 != null) {//登录名已经有了
            msg.setStr("用户登录名已经存在");
            return msg;
        } else {
            userService.save(user);//插入具体数据
            msg.setStr("success");
            return msg;
        }
    }

    //用户登录
    @RequestMapping("/accessLogin")
    @ResponseBody
    public Message accessLogin(HttpServletRequest request, String loginName, String loginPwd, Model model) {
        User user = userService.findByUserLoginName(loginName);//根据登录名向数据库中查询用户
        Message msg = new Message();
        if (user == null) {
            msg.setStr("用户名不存在");
            return msg;
        } else {
            User currUser = userService.userLogin(loginName, loginPwd);
            if (currUser != null) {
                HttpSession session = request.getSession();
                session.setAttribute("currUser", currUser);
                msg.setStr("success");
                return msg;
            } else {
                msg.setStr("用户名密码不匹配");
                return msg;
            }
        }
    }

    //用户安全退出
    @RequestMapping(value = "/exit")
    public String exit(HttpServletRequest request) throws Exception {
        //退出时清空session
        request.getSession().removeAttribute("currUser");
        return "/main/index";
    }

    //查看个人简历
    @RequestMapping("/showResume")
    public String showResume(Model model, HttpServletRequest request) {
        //获得session中存的当前对象
        User currUser = (User) request.getSession().getAttribute("currUser");
        String realname = currUser.getRealname();
        //根据真实姓名查询用户
        User user = userService.findUserByRealname(realname);
        model.addAttribute("user", user);
        return "/user/showUserResume";
    }

    //修改简历
    @RequestMapping("/editResume")
    public String editResume(Model model, Integer uid) {
        User user = userService.findById(uid);
        if (user != null) {
            model.addAttribute("user", user);
        }
        return "/user/editResume";
    }

    //保存简历
    @RequestMapping("/saveResume")
    public String saveResume(Model model, User user) {
        int num = userService.saveResume(user);
        if (num == 1) {
            model.addAttribute("user", user);
            return "/user/showUserResume";//转发到预览简历
        } else {
            return "/user/login";
        }
    }

    //企业据用户真实名字查询其详细

    @RequestMapping("/findUserByRealname")
    public String findUserByRealname(String realname,Model model) {
        User user = userService.findUserByRealname(realname);
        if(user!=null){
            model.addAttribute("user", user);
            return "/company/listUser";
        }else{
            throw new RuntimeException("对不起，没有该用户的具体信息");
        }
    }

   //查询所有的用户
    @RequestMapping("/findAllUser")
    public String findAllUser(Model model){
        List<User> userList = userService.findAllUser();
        model.addAttribute("userList", userList);
        return "/user/listUser";
    }

    // 根据ID进行删除
    @RequestMapping("/deleteById")
    public String deleteById(Integer uid) {
        userService.deleteById(uid);
        // 重定向到用户列表界面
        return "redirect:/user/findAllUser";
    }

    //查看用户总人数
    @RequestMapping("/countUserNumber")
    @ResponseBody
    public void countUserNumber(HttpSession session){
        int userNumber = userService.countUserNumber();
        session.setAttribute("userNumber",userNumber);
    }

}
