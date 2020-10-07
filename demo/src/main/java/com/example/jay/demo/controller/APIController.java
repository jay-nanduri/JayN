package com.checkmarx.jay.sample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("/")
    String welcomePage() {
        return "Welcome Page reached";
    }

    @GetMapping("/hello")
    String welcomePage() {
        return "Hello Page reached";
    }

}
