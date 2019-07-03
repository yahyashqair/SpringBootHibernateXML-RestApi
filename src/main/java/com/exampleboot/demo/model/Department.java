package com.exampleboot.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
@Component
@JsonIgnoreProperties({ "studentSet" })
public @Data class Department {
    private Integer id ;
    private String name ;
    private Set<Student> studentSet = new HashSet<Student>();
}
