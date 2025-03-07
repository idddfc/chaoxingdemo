package com.hangzhoudianzi.demo.controller;

import com.hangzhoudianzi.demo.pojo.resource.SchedulingStrategy;
import com.hangzhoudianzi.demo.service.SchedulingStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/strategy")
public class SchedulingStrategyController {
    @Autowired
    private SchedulingStrategyService strategyService;

    @GetMapping("/getCurrentStrategy")
    public SchedulingStrategy getCurrentStrategy() {
        return strategyService.getCurrentStrategy();
    }
}