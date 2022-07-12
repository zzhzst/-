package com.myweb.service;

import java.util.List;

import com.myweb.pojo.User;

public interface UserService {

    //用户注册
    public int save(User user);

    //查找是否有同名的用户
    public User findByUserLoginName(String loginName);

    //登录
    public User userLogin(String loginName, String loginPwd);

    //根据真实姓名查找用户信息
    public User findUserByRealname(String realname);

    //根据用户id查找用户信息
    public User findById(Integer uid);

    //保存简历，也就是个人信息
    public int saveResume(User user);
}
