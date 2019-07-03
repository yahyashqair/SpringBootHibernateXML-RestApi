package com.exampleboot.demo.controller;

import com.exampleboot.demo.dto.StudentDto;
import com.exampleboot.demo.model.Student;
import com.exampleboot.demo.repo.CrudStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    CrudStudent crudStudent;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student get(@PathVariable("id") int id) {
        Student student = crudStudent.findStudent(id);
        return student;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Student post(@RequestBody StudentDto studentDto) {
        Student student = crudStudent.creatStudent(studentDto.getName(), studentDto.getDid(), studentDto.getYear());
        return student;
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Student put(@RequestBody StudentDto studentDto) {
        if (studentDto.getId() == 0) return null;
        Student student = crudStudent.updateStudent(studentDto.getId(), studentDto.getName());
        return student;
    }

}
