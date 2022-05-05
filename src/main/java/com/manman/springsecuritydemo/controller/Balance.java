package com.manman.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Balance {

    @GetMapping("/balance")
    public String checkBalance(){
        return "You are in balance section";
    }
}
