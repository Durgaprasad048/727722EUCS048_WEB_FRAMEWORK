package com.example.ce1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.DurgaprasadEmployee;
import com.example.ce1.repository.DurgaprasadEmployeeRepo;

@Service
public class DurgaprasadEmployeeService {
    @Autowired
    DurgaprasadEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public DurgaprasadEmployee setEmployee(DurgaprasadEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<DurgaprasadEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<DurgaprasadEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
