package com.example.cw4.service;

import com.example.cw4.model.durgaprasadEmployee;
import com.example.cw4.repository.durgaprasadEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class durgaprasadEmployeeService {

    @Autowired
    private durgaprasadEmployeeRepository employeeRepository;

    public List<durgaprasadEmployee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public durgaprasadEmployee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public durgaprasadEmployee addEmployee(durgaprasadEmployee employee) {
        return employeeRepository.save(employee);
    }
}