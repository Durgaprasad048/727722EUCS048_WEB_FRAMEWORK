package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.durgaprasadStudent;
import com.example.relation.service.durgaprasadStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class durgaprasadStudentController {
    public durgaprasadStudentService studentService;
    public durgaprasadStudentController(durgaprasadStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public durgaprasadStudent postMethodName(@RequestBody durgaprasadStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<durgaprasadStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
