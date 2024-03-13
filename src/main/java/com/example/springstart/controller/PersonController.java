package com.example.springstart.controller;

import com.example.springstart.model.Person1;
import com.example.springstart.service.Person1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private Person1Service person1Service;

    @PostMapping
    public ResponseEntity<Person1> save(@RequestBody Person1 person1){
        Person1 save = person1Service.save(person1);
        return ResponseEntity.ok(save);
    }
}
