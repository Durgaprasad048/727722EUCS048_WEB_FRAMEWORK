package com.example.cw4.service;

import com.example.cw4.model.durgaprasadCompany;
import com.example.cw4.repository.durgaprasadCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class durgaprasadCompanyService {

    @Autowired
    private durgaprasadCompanyRepository companyRepository;

    public List<durgaprasadCompany> getAllCompanies() {
        return companyRepository.findAll();
    }

    public durgaprasadCompany getCompanyById(int id) {
        return companyRepository.findById(id).orElse(null);
    }

    public durgaprasadCompany addCompany(durgaprasadCompany company) {
        return companyRepository.save(company);
    }
}