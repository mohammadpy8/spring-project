package com.example.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")

public class HomeController {

    @GetMapping("/index")
    public String home(){
        return "HomeController";
    }
    @GetMapping("/test")
    public String test(){
        return "test";
    }
}

