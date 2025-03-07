package com.hangzhoudianzi.demo.service;

import com.hangzhoudianzi.demo.mapper.TimetableMapper;
import com.hangzhoudianzi.demo.pojo.resource.Timetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimetableService {
    @Autowired
    private TimetableMapper timetableMapper;

    public int addTimetable(Timetable timetable) {
        return timetableMapper.insertTimetable(timetable);
    }

    public List<Timetable> getAllTimetables() {
        return timetableMapper.getAllTimetables();
    }
}