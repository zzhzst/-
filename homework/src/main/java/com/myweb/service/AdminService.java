package com.myweb.service;

import com.myweb.pojo.Admin;
import org.apache.ibatis.annotations.Param;


public interface AdminService {
    public Admin getAdminByNameAndPwd(String adminName,String adminPwd);
}
