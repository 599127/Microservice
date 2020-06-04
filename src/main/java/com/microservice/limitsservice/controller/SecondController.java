package com.microservice.limitsservice.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    public SecondController() {
        System.out.println("IN Second Controller");
    }
}
