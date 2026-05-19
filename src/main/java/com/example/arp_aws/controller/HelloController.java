package com.example.arp_aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot running locall!";
    }

    @GetMapping("/hello-cloud")
    public String helloFromCloud() {
        return "Hello, Ahmed from Spring Boot running in the Cloud!";
    }

    @GetMapping("/hello-fraz")
    public String sayHelloToShakir() {
        return "Hello Faraz, from AWS cloud";
    }
}
