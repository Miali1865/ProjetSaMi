package com.example.projetvehicule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetVehiculeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetVehiculeApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(name="vehicule") String name) {
        return String.format("Hello %s!", name);
    }

}
