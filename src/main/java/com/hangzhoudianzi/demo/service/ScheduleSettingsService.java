package com.hangzhoudianzi.demo.service;

import com.hangzhoudianzi.demo.mapper.ScheduleSettingsMapper;
import com.hangzhoudianzi.demo.pojo.resource.ScheduleSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleSettingsService {
    @Autowired
    private ScheduleSettingsMapper scheduleSettingsMapper;

    public ScheduleSettings getScheduleSettingsById(int id) {
        return scheduleSettingsMapper.getScheduleSettingsById(id);
    }

    public List<ScheduleSettings> getAllScheduleSettings() {
        return scheduleSettingsMapper.getAllScheduleSettings();
    }

    public int insertScheduleSettings(ScheduleSettings settings) {
        return scheduleSettingsMapper.insertScheduleSettings(settings);
    }

    public int updateScheduleSettings(ScheduleSettings settings) {
        return scheduleSettingsMapper.updateScheduleSettings(settings);
    }

    public int deleteScheduleSettings(int id) {
        return scheduleSettingsMapper.deleteScheduleSettings(id);
    }
}