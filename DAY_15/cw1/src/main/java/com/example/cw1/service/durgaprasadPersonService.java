package com.example.cw1.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.cw1.model.durgaprasadPerson;
import com.example.cw1.repository.durgaprasadPersonRepo;

@Service
public class durgaprasadPersonService {
    @Autowired
    private durgaprasadPersonRepo repo;

    public durgaprasadPerson createPerson(durgaprasadPerson person) {
        return repo.save(person);
    }

    public List<durgaprasadPerson> getAllPersons() {
        return repo.findAll();
    }
}
