package com.myweb.pojo;

public class JobInfoExt extends Job{
    //公司信息
    private Company company;
    //职位申请信息
    private Apply apply;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Apply getApply() {
        return apply;
    }

    public void setApply(Apply apply) {
        this.apply = apply;
    }
}
