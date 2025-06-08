package com.example.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public Map<String, String> greeting(@RequestParam String name) {
        return Map.of("message", "hello world " + name);
    }
}
