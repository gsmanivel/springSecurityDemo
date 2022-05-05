package com.manman.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutUs {

    @GetMapping("/aboutUs")
    public String aboutUs(){
        return "You have reached About us Section";
    }
}
