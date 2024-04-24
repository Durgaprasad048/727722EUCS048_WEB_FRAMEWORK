package com.example.class_exercise_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.model.durgaprasadStudent;
import com.example.class_exercise_2.repository.durgaprasadStudentRepo;

@Service
public class durgaprasadStudentService {

     @Autowired
     public durgaprasadStudentRepo studentRepo;

     public List<durgaprasadStudent> getAll() {
          return studentRepo.findAll();
     }

     public durgaprasadStudent post(durgaprasadStudent student) {
          return studentRepo.save(student);
     }

     public List<durgaprasadStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
