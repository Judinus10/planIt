package com.planIt.planIt.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Allow requests from any domain
public class controller {

        @GetMapping("/")
    public String hello() {
        return "Backend is running!";
    }   

}
