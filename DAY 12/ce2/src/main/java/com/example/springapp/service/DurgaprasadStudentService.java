package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.DurgaprasadStudent;
import com.example.springapp.repository.DurgaprasadStudentRepository;

@Service
public class DurgaprasadStudentService {
    @Autowired
    DurgaprasadStudentRepository studentRepository;
    public DurgaprasadStudent addStudents(DurgaprasadStudent student)
    {
        return studentRepository.save(student);
    }
    public List<DurgaprasadStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<DurgaprasadStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<DurgaprasadStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
