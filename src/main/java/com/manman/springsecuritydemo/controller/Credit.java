package com.manman.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Credit {

    @GetMapping("/credit")
    public String checkCredit(){
        return "You are in credit section";
    }
}
