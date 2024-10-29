package com.kpjavaspringboot.controller;


import com.kpjavaspringboot.KPJavaSpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CRUDController {

    private static Logger logger = LoggerFactory.getLogger(KPJavaSpringBootApplication.class);

    @Value("${app.title}") // Injecting the value of app.greeting from application.properties
    private String greeting;

    @GetMapping("/CRUD/greet")
    public String greet() {
        System.out.println("KP : KPJavaSpringBootApplication : CRUDController : greet()");
        logger.info("KP : KPJavaSpringBootApplication : main()");

        return greeting; // Return the value of app.greeting
    }
}