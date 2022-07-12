package com.myweb.service.impl;

import com.myweb.mapper.CompanyMapper;
import com.myweb.pojo.Company;
import com.myweb.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    CompanyMapper companyMapper;

    @Override
    public int insert(Company company) {
        return companyMapper.insert(company);
    }

    @Override
    public Company findCompanyByName(String companyLoginName) {
        return companyMapper.findCompanyByName(companyLoginName);
    }

    @Override
    public Company findByCompanyName(String companyName) {
        return companyMapper.findByCompanyName(companyName);
    }

    @Override
    public Company getCompanyByNameAndPwd(String companyLoginName, String companyPwd) {
        return companyMapper.getCompanyByNameAndPwd(companyLoginName, companyPwd);
    }

    @Override
    public Company findCompanyById(Integer cid) {
        return companyMapper.findCompanyById(cid);
    }
}
