package com.example.springstart.response;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Person {
    private final Long id;
    private final String name;
    private final String lastname;

    public Person(Long id, String name, String lastname){
        this.id = id;
        this.lastname = lastname;
        this.name = name;
    }
    @NotNull(message = "name is not a null")
    @NotBlank(message = "name is not a blank")
    public String getName() {
        return name;
    }

    @NotNull(message = "id is a not null")
    @Min(value = 0)
    @Max(value = 1000)
    public Long getId() {
        return id;
    }
    @NotNull(message = "lastname is a not null")
    @NotBlank(message = "lastname is a not blank")
    public String getLastname() {
        return lastname;
    }
}
