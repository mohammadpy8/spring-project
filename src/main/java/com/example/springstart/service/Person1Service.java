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

    public Person1 update(Person1 person1) {
        Person1 updatePerson = person1Repository.findById(person1.getId())
                .orElseThrow(() -> new RuntimeException("not found"));
        updatePerson.setName(person1.getName());
        updatePerson.setLastname(person1.getLastname());
        Person1 saveUpdate = person1Repository.save(updatePerson);
        return saveUpdate;
    }
}
