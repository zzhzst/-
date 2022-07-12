package com.myweb.mapper;

import com.myweb.pojo.Admin;

public interface AdminMapper {
    //管理员登录
    public Admin getAdminByNameAndPwd(String adminName,String adminPwd);
}
