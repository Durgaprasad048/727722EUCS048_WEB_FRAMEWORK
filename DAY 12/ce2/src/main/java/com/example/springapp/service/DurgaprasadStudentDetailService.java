package com.example.springapp.service;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.DurgaprasadStudentDetail;
import com.example.springapp.repository.DurgaprasadStudentDetailRepository;
import com.example.springapp.repository.DurgaprasadStudentRepository;

@Service
public class DurgaprasadStudentDetailService {
    @Autowired
    DurgaprasadStudentDetailRepository studentDetailRepository;
    @Autowired
    DurgaprasadStudentRepository studentRepository;
    public DurgaprasadStudentDetail addStudentDetail(int id,DurgaprasadStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
