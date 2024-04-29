package com.example.ce1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.model.DurgaprasadAddress;
import com.example.ce1.repository.DurgaprasadAddressRepo;
import com.example.ce1.repository.DurgaprasadEmployeeRepo;

@Service
public class DurgaprasadAddressService {
    @Autowired
    DurgaprasadAddressRepo addressRepo;
    @Autowired
    DurgaprasadEmployeeRepo employeeRepo;
    public DurgaprasadAddress setAddressById(int id,DurgaprasadAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
