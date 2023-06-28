package org.chubxu.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/test")
    public String helloworld() {
        return "Hello Spring Boot 3.0";
    }
}
