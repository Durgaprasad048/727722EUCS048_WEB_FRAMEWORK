package com.example.cw4.repository;

import com.example.cw4.model.durgaprasadCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface durgaprasadCompanyRepository extends JpaRepository<durgaprasadCompany, Integer> {
}