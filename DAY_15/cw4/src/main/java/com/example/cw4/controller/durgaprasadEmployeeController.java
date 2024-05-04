package com.example.cw4.controller;

import com.example.cw4.model.durgaprasadEmployee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.cw4.service.durgaprasadEmployeeService;

@RestController
@RequestMapping("/employees")
public class durgaprasadEmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(durgaprasadEmployeeController.class);

    @Autowired
    private durgaprasadEmployeeService EmployeeService;

    @GetMapping
    public ResponseEntity<List<durgaprasadEmployee>> getAllEmployees() {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/employees; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                "N/A", HttpStatus.OK.value(), "List of Employees", "N/A");
        List<durgaprasadEmployee> Employees = EmployeeService.getAllEmployees();
        return ResponseEntity.ok(Employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<durgaprasadEmployee> getEmployeeById(@PathVariable("id") int id) {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/employees/{}; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                id, HttpStatus.OK.value(), "Employee details", "N/A");
        durgaprasadEmployee Employee = EmployeeService.getEmployeeById(id);
        return ResponseEntity.ok(Employee);
    }

    @PostMapping
    public ResponseEntity<durgaprasadEmployee> addEmployee(@RequestBody durgaprasadEmployee Employee) {
        logger.info("FINISHED PROCESSING : METHOD=POST; REQUESTURI=/employees; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                Employee, HttpStatus.CREATED.value(), "Employee added successfully", "N/A");
        durgaprasadEmployee savedEmployee = EmployeeService.addEmployee(Employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}