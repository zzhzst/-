package com.myweb.service.impl;

import com.myweb.mapper.EboardMapper;
import com.myweb.pojo.Eboard;
import com.myweb.service.EboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EboardServiceImpl implements EboardService {
    @Autowired
    EboardMapper eboardMapper;

    @Override
    public List<Eboard> findAllJournalism() {
        return eboardMapper.findAllJournalism();
    }
}
