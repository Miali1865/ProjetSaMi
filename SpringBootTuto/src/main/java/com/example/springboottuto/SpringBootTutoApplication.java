package com.example.springboottuto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTutoApplication {

    /* public static void main(String[] args) {
        SpringApplication.run(SpringBootTutoApplication.class, args);
    } */

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTutorialApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

}
