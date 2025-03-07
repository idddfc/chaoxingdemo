package com.hangzhoudianzi.demo.pojo.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleSettings {
    // ① 排课的最小单位（默认：教学班）
    private String schedulingUnit;  // 例如："teaching_class"

    // ② 每天上课总节数（例如：8节）
    private int totalPeriodsPerDay;
    // 两节连排的开始节次，如：1,3,5,7
    private List<Integer> twoPeriodBlockStart;
    // 四节连排的开始节次，如：1,3,5
    private List<Integer> fourPeriodBlockStart;

    // ③ 禁排设置
    private boolean banBySchool;      // 学校维度禁排
    private boolean banByTeacher;     // 教师维度禁排
    private boolean banByStudent;     // 学生维度禁排
    private boolean banByCourse;      // 课程维度禁排
    private boolean banByClassroom;   // 教室维度禁排
    private boolean banByRole;        // 角色维度禁排（如教学秘书、教研室主任）

    // ④ 优先级设置
    private boolean studentDepartmentPriority;  // 学生所在院系优先
    private boolean courseDepartmentPriority;     // 开课院系优先
    private boolean courseNaturePriority;         // 按照课程性质优先
    private boolean creditTypePriority;           // 按照学时类型优先
    private boolean courseTypePriority;           // 按照课程类型优先

    // ⑤ 排课教室是否启用班级固定教室
    private boolean useFixedClassroom;

    // ⑥ 排课教室集中设置
    private boolean concentrateClassroomForClass;   // 班级排课教室尽量集中
    private boolean concentrateClassroomForTeacher; // 教师排课教室尽量集中
    private boolean sameClassroomForSameCourse;      // 同一课程使用相同教室

    // ⑧ 教师排课节数设置
    private int teacherMaxPeriodsPerDay;      // 教师每天最大节数
    private int teacherMaxPeriodsPerWeek;     // 教师每周最大节数
    private int teacherMaxMorningPeriods;     // 教师上午最大节次
    private int teacherMaxAfternoonPeriods;   // 教师下午最大节次

    // ⑨ 体育课安排设置
    private boolean peClassAfternoonOnly; // 体育课是否只能安排在下午
    private boolean scheduleAfterPeClass; // 体育课后是否安排其他课程

    // ⑩ 学校晚上是否上课
    private boolean eveningClasses;

    // ⑪ 实验课程是否只能安排在晚上
    private boolean labClassEveningOnly;

    // ⑫ 多学时课程是否要求连续排（例如理论、实验、上机连续安排）
    private boolean multiHourClassesConsecutive;

    // ⑬ 当周学时无法被连排节次整除时的安排方式
    public enum InsufficientArrangementMethod {
        SPLIT_BY_ODD_EVEN_WEEK,   // 按单双周拆分
        REDUCE_CONSECUTIVE_PERIODS // 降低连排节次
    }
    private InsufficientArrangementMethod insufficientArrangementMethod;

    // ⑭ 可勾选部分课程先排课
    private boolean scheduleSelectedCoursesFirst;

    // ⑮ 自动排课时是否清除掉之前的已排信息
    private boolean clearPreviousScheduleOnAuto;

    // ⑯ 自动排课时是否需要安排地点
    private boolean autoScheduleAssignLocation;

    // ⑰ 关于排课监控、⑱ 排课结果下载等功能通常由系统运行时数据统计与导出模块实现，
    //     这里不作为配置项存储在设置中，可单独设计监控模块。
}