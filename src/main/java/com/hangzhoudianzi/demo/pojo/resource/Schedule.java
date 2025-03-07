package com.hangzhoudianzi.demo.pojo.resource;

import lombok.Data;

@Data
public class Schedule {
    private Long id;
    private Long courseId;
    private Long teacherId;
    private Long classroomId;
    private String timeSlot;    // 如"周一1-2节"
    private String weekRange;   // 如"1-16周"
}
