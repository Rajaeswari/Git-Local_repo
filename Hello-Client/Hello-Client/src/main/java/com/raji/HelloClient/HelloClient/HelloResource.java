package com.raji.HelloClient.HelloClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/client")
public class HelloResource{

    @GetMapping
    public String hello()
    {
        return "Hello client Service!";
    }
}