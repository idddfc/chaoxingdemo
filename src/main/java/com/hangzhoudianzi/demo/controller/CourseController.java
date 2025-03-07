package com.hangzhoudianzi.demo.controller;

import com.hangzhoudianzi.demo.mapper.CourseMapper;
import com.hangzhoudianzi.demo.pojo.people.Course;
import com.hangzhoudianzi.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private CourseMapper courseMapper;

    @GetMapping("/getAllCourses")
    public List<Course> getAllCourses() {
        List<Course> list = courseService.list();
        return list;
    }

    @GetMapping("/getCourse/{course_id}")
    public Course getCourseById(@PathVariable("course_id") String course_id) throws Exception {
        Course course = courseMapper.getCourseById(course_id);
        if (course == null) {
            throw new Exception("没有找到此教室");
        }
        return course;
    }
    @PostMapping("/insertCourse")
    public String insertCourse(@RequestBody Course course) {
        Course courses =courseService.getCourseById(course.getCourseId());
        if (courses == null) {
            boolean save = courseService.save(course);
            if (save) {
                return "添加成功";
            } else return "添加失败";
        } else return "已添加课程，请勿重复操作！";
    }

//    @PostMapping("/updateCourse")
//    public List<Course> updateCourse(Course course) {
//        return courseService.updateCourse(course);
//    }

    @PostMapping("/deleteCourse/{course_id}")
    public String deleteCourse(@PathVariable("course_id") String course_id) {
        Course course = courseService.getCourseById(course_id);
        if(course == null){
            return "没有此课程";
        }else {
            boolean b = courseService.removeById(course_id);
            if(b){
                return "删除成功";
            }else return "删除失败";
        }
    }
}
