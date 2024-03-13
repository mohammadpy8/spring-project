package com.example.springstart.response;

import lombok.Getter;

public class Person {
    private final Long id;
    private final String name;
    private final String lastname;

    public Person(Long id, String name, String lastname){
        this.id = id;
        this.lastname = lastname;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }
}
