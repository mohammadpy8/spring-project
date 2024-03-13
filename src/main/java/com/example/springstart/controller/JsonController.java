package com.example.springstart.controller;

import com.example.springstart.response.Error;
import com.example.springstart.response.Person;
import com.example.springstart.response.Personal;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public ResponseEntity<Person> save(@RequestBody @Valid Person person){
        return ResponseEntity.ok(person);
    }
    @PostMapping("/save-person")
    public ResponseEntity<Person> savePerson(@RequestBody @Valid Person person){
        return ResponseEntity.status(202).body(person);
    }
    @PostMapping("/personal")
    public ResponseEntity<Personal> savePersonal(@RequestBody @Valid Personal personal){
        return ResponseEntity.status(200).body(personal);
    }
}
