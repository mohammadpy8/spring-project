package com.example.springstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")

public class HomeController {

    @GetMapping("/index")
    public String home() {
        return "HomeController";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/user")
    public String[] user() {
        return new String[]{"name", "full_name"};
    }

    @GetMapping("/post/{number1}/{number2}")
    public String post(@PathVariable Long number1, @PathVariable Long number2) {
        return String.valueOf(number1 + number2);
    }
    @GetMapping("/new-post")
    public String newPost(@RequestParam Long number1, @RequestParam Long number2) {
        return String.valueOf(number1 + number2);
    }
}
