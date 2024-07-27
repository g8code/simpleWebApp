package com.hrutik.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Spring Boot CRUD Operations using Postman API!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "I am a Full stack Java developer.";
    }

}
