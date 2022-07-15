package com.myweb.service.impl;

import com.myweb.mapper.AdminMapper;
import com.myweb.pojo.Admin;
import com.myweb.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    @Override
    public Admin getAdminByNameAndPwd(String adminName, String adminPwd) {
        return adminMapper.getAdminByNameAndPwd(adminName,adminPwd);
    }
}
