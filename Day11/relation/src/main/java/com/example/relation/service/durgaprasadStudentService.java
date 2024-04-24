package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.durgaprasadStudent;
import com.example.relation.repository.durgaprasadStudentRepository;

@Service
public class durgaprasadStudentService {
    public durgaprasadStudentRepository studentRepository;
    public durgaprasadStudentService(durgaprasadStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public durgaprasadStudent saveStudent(durgaprasadStudent student)
    {
        return studentRepository.save(student);
    }
    public List<durgaprasadStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
