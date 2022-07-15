package com.myweb.mapper;

import com.myweb.pojo.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminMapper {
    //管理员登录
    public Admin getAdminByNameAndPwd(@Param("adminName") String adminName, @Param("adminPwd") String adminPwd);
}
