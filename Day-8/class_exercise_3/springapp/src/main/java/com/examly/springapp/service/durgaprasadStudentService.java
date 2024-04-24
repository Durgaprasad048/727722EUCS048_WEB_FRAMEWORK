package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.durgaprasadStudent;
import com.examly.springapp.repository.durgaprasadStudentRepo;

@Service
public class durgaprasadStudentService {
    @Autowired
    private durgaprasadStudentRepo studentRepo;

    public boolean post(durgaprasadStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<durgaprasadStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<durgaprasadStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}
