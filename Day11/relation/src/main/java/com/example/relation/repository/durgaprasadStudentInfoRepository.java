package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.durgaprasadStudentInfo;

@Repository
public interface durgaprasadStudentInfoRepository extends JpaRepository<durgaprasadStudentInfo,Integer>{
    
}