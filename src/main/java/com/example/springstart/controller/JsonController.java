package com.example.springstart.controller;

import com.example.springstart.response.Error;
import com.example.springstart.response.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class JsonController {
    @GetMapping("/{id}/{name}/{lastname}")
    public ResponseEntity<Person> person(@PathVariable Long id, @PathVariable String name, @PathVariable String lastname) {
        return ResponseEntity.ok(new Person(id, name, lastname));
    }
    @GetMapping("/index/{id}/{index}")
    public ResponseEntity<Error> error(@PathVariable Integer id, @PathVariable Integer index) {
        return ResponseEntity.status(202).body(new Error(id, index));
    }
}
