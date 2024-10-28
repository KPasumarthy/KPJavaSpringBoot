package com.kpjavaspringboot.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CRUDController {

    @Value("${app.title}") // Injecting the value of app.greeting from application.properties
    private String greeting;

    @GetMapping("/CRUD/greet")
    public String greet() {
        System.out.println("KP : KPJavaSpringBootApplication : CRUDController : greet()");
        return greeting; // Return the value of app.greeting
    }
}