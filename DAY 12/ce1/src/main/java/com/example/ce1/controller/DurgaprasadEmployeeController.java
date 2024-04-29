package com.example.ce1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.model.DurgaprasadEmployee;
import com.example.ce1.service.DurgaprasadEmployeeService;

@RestController
public class DurgaprasadEmployeeController {
    @Autowired
    DurgaprasadEmployeeService employeeService;

    @PostMapping("/employee")
    public DurgaprasadEmployee setMethod(@RequestBody DurgaprasadEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<DurgaprasadEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<DurgaprasadEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
