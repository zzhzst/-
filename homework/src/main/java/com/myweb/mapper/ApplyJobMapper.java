package com.myweb.mapper;

import com.myweb.pojo.Apply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplyJobMapper {

    //根据企业名查询所有的求职申请
    List<Apply> findAllByCompanyName(String companyName);

    //根据真实名字，工作地址，工作名字查询是否有申请记录
    Apply findApplyByAll(@Param("realname") String realname, @Param("jobAddress") String jobAdress, @Param("jobName") String jobName);

    //添加求职申请
    int insertApply(Apply apply_);

    //根据真实姓名查找所有的申请记录
    List<Apply> findApplyRecordByRealname(String realname);

    //查询投递次数
    int countApplyNumber();
}
