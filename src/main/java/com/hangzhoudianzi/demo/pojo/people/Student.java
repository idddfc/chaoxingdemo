package com.hangzhoudianzi.demo.pojo.people;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private Integer id;
    private String name;
    private String grade;
    private String major;
    private String className;

}