package com.aouth2.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class loginController {

    @GetMapping("/")
    public String index(){
        return "Hello world";
    }

    @GetMapping("/private")
    public String privateArea(){
        return "Private area";
    }
}
