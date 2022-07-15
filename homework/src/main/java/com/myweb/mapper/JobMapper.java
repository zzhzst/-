package com.myweb.mapper;

import com.myweb.pojo.Job;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JobMapper {
    //新增职位
    int insertJob(Job job);

    //根据企业id和职位名字查找是否有重复的职位
    Job findByCidAndJobName(@Param("cid") Integer cid, @Param("jobName") String jobName);

    //根据企业id查询企业发布的职位
    List<Job> findJobByCom(Integer cid);

    //根据职位id删除职位
    int deleteJobById(Integer jobId);

    //查询职位个数
    int countJobNumber();
}
