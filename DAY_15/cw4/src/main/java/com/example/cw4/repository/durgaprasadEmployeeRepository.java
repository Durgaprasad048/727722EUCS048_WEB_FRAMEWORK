package com.example.cw4.repository;

import com.example.cw4.model.durgaprasadEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface durgaprasadEmployeeRepository extends JpaRepository<durgaprasadEmployee, Integer> {
}