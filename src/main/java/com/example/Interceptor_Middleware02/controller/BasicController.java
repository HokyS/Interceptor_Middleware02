package com.example.Interceptor_Middleware02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BasicController {

    @GetMapping("")
    public String welcome(){
        return "Welcome to SuperMirkoPlus8080";
    }
}