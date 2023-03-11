package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/hello-world")

public class HelloWorldController {
    @GetMapping("/say-hello")

    public ResponseEntity<Map<String, String>> sayHello(){
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello World");
        return new ResponseEntity<Map<String, String>>(response, HttpStatus.OK);
    }

    @GetMapping("/persona")

    public ResponseEntity<Person> getPersona(){
        Person p = new Person("Manu", "Camacho", 22);
        return new ResponseEntity<Person>(p, HttpStatus.OK);
    }
}
