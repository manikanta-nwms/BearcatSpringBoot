package com.example.bearcat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLogin {
    @GetMapping("/login")
    public String login(){
        return "welcome";
    }
}
