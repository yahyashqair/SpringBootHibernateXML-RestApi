package com.exampleboot.demo.controller;
import com.exampleboot.demo.dto.CourseDto;
import com.exampleboot.demo.dto.StudentDto;
import com.exampleboot.demo.model.Course;
import com.exampleboot.demo.model.Department;
import com.exampleboot.demo.model.Student;
import com.exampleboot.demo.repo.CrudCourse;
import com.exampleboot.demo.repo.CrudDepartment;
import com.exampleboot.demo.repo.CrudStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/*
@RestController
@RequestMapping(value = "/course")
public class DepartmentController {

    @Autowired
    CrudDepartment crudDepartment;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Department get(@PathVariable("id") int id) {
        Department department = crudDepartment.findDepartment(id);
        return department;
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
*/