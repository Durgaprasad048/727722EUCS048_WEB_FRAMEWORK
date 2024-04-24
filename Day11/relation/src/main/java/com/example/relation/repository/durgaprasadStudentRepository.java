package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.durgaprasadStudent;

@Repository
public interface durgaprasadStudentRepository extends JpaRepository<durgaprasadStudent,Integer>{
    
}
