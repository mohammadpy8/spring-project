package com.example.springstart.service;

import com.example.springstart.model.Person1;
import com.example.springstart.repository.Person1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Person1Service {

    @Autowired
    private Person1Repository person1Repository;
    public Person1 save(Person1 person1) {
        return person1Repository.save(person1);
    }
}
