package com.hangzhoudianzi.demo.mapper;

import com.hangzhoudianzi.demo.pojo.resource.SchedulingStrategy;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface SchedulingStrategyMapper {
    SchedulingStrategy getCurrentStrategy();
}