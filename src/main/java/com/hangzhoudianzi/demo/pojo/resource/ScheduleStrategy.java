package com.hangzhoudianzi.demo.pojo.resource;

import lombok.Data;

@Data
public class ScheduleStrategy {
    private Long id;
    private boolean teacherLocationConcentrated; // 教师地点集中
    private boolean classroomCapacityMatched;    // 教室容量匹配
    private String specialCoursePriority;        // 特殊课程优先级
}
