package com.example.day5cw2.service;

import org.springframework.stereotype.Service;

import com.example.day5cw2.model.durgaprasadEmployee;
import com.example.day5cw2.repository.durgaprasadEmployeeRepo;

@Service
public class durgaprasadEmployeeService {
    public durgaprasadEmployeeRepo employeeRepo;
    public durgaprasadEmployeeService(durgaprasadEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(durgaprasadEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,durgaprasadEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public durgaprasadEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
