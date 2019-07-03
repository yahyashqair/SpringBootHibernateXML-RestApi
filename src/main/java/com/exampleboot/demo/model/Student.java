package com.exampleboot.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
@Component
@JsonIgnoreProperties({ "department" , "courseSet" })
public @Getter @Setter
class Student {
    private Integer sid;
    private Department department;
    private String name;
    private int year;
    private Set<Course> courseSet = new HashSet<Course>();

    public Student() {
        this.sid = null;
    }

    public Student(int sid, String name, int year) {
        this.sid = sid;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", department=sof" +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", courseSet#=" + courseSet.size() +
                '}';
    }
}
