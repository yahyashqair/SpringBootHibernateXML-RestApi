package com.exampleboot.demo.controller;

import com.exampleboot.demo.dto.CourseDto;
import com.exampleboot.demo.dto.StudentDto;
import com.exampleboot.demo.model.Course;
import com.exampleboot.demo.model.Student;
import com.exampleboot.demo.repo.CrudCourse;
import com.exampleboot.demo.repo.CrudStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @Autowired
    CrudCourse crudCourse;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Course get(@PathVariable("id") int id) {
        Course course = crudCourse.findCourse(id);
        return course;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Course post(@RequestBody CourseDto courseDto) {
        Course course = crudCourse.creatCourse(courseDto.getName());
        return course;
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Course put(@RequestBody CourseDto courseDto) {
        if (courseDto.getId() == 0) return null;
        Course course = crudCourse.updateCourse(courseDto.getId(), courseDto.getName());
        return course;
    }
}
