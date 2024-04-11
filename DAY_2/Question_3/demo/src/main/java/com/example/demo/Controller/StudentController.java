package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudentDetails() {
        Student stu=new Student();
        stu.setId(1L);
        stu.setName("John Doe");
        stu.setDescription("This is a student description");
        return stu;
    }
    
}