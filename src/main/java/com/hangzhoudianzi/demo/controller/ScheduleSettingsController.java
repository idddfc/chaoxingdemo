package com.hangzhoudianzi.demo.controller;

import com.hangzhoudianzi.demo.pojo.resource.ScheduleSettings;
import com.hangzhoudianzi.demo.service.ScheduleSettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 这是注释
 */
@RestController
@RequestMapping("/api/schedulesettings")
public class ScheduleSettingsController {

    @Autowired
    private ScheduleSettingsService scheduleSettingsService;

    @GetMapping("/{id}")
    public ScheduleSettings getScheduleSettingsById(@PathVariable int id) {
        return scheduleSettingsService.getScheduleSettingsById(id);
    }

    @GetMapping("/getAllScheduleSettings")
    public List<ScheduleSettings> getAllScheduleSettings() {
        return scheduleSettingsService.getAllScheduleSettings();
    }

    @PostMapping("/insertScheduleSettings")
    public String insertScheduleSettings(@RequestBody ScheduleSettings settings) {
        int result = scheduleSettingsService.insertScheduleSettings(settings);
        return result > 0 ? "Insert success" : "Insert failed";
    }

    @PutMapping("/updateScheduleSettings")
    public String updateScheduleSettings(@RequestBody ScheduleSettings settings) {
        int result = scheduleSettingsService.updateScheduleSettings(settings);
        return result > 0 ? "Update success" : "Update failed";
    }

    @DeleteMapping("/eleteScheduleSettings/{id}")
    public String deleteScheduleSettings(@PathVariable int id) {
        int result = scheduleSettingsService.deleteScheduleSettings(id);
        return result > 0 ? "Delete success" : "Delete failed";
    }
}