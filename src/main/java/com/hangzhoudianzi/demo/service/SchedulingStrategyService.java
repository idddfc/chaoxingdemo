package com.hangzhoudianzi.demo.service;

import com.hangzhoudianzi.demo.mapper.SchedulingStrategyMapper;
import com.hangzhoudianzi.demo.pojo.resource.SchedulingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchedulingStrategyService {
    @Autowired
    private SchedulingStrategyMapper strategyMapper;

    public SchedulingStrategy getCurrentStrategy() {
        return strategyMapper.getCurrentStrategy();
    }
}