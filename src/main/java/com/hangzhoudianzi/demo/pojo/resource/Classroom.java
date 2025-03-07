package com.hangzhoudianzi.demo.pojo.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Classroom {
    private int id;
    private String building;
    private String roomNumber;
    private Integer capacity;

}