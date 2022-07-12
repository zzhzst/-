package com.myweb.mapper;

import com.myweb.pojo.Company;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    //企业注册
    int insert(Company company);

    //根据公司登录名查找公司
    Company findCompanyByName(String companyLoginName);

    //根据公司实际名字查找公司
    Company findByCompanyName(String companyName);

    //企业登录
    Company getCompanyByNameAndPwd(@Param("companyLoginName") String companyLoginName, @Param("companyPwd") String companyPwd);

    //根据公司id查找公司
    Company findCompanyById(Integer cid);
}
