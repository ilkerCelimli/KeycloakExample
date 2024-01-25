package com.keycloakexample.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1")
@RestController
public class DemoController {

    @GetMapping
    public String hello() {
        return "Hello World";
    }

}
