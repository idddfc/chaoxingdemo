package com.hangzhoudianzi.demo.pojo.resource;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SchedulingStrategy {
    private Integer id;
    // 自动排课模式：true=自动，false=手工
    private Boolean autoMode;
    // 排课策略相关设置示例
    private Boolean teacherLocationConcentration;
    private Boolean classroomCapacityMatch;
    // 时间约束、特殊课程标识等，可以根据需要扩展
    private String timeConstraint;

}
