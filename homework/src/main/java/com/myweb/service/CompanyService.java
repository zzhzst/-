package com.myweb.service;

import com.myweb.pojo.Company;

import java.util.List;


public interface CompanyService {
    //注册公司
    public int insert(Company company);

    //根据公司登录名查找公司
    public Company findCompanyByName(String companyLoginName);

    //根据公司的实际名称查找公司
    public Company findByCompanyName(String companyName);

    //公司登录
    Company getCompanyByNameAndPwd(String companyLoginName, String companyPwd);

    //根据公司id查找公司
    Company findCompanyById(Integer cid);

    //查找所有的公司
    List<Company> findAll();

    //根据id删除公司
    int deleteById(Integer cid);

    int editCompanySubit(Company company);

    //查看公司数量
    int findComNumber();
}
