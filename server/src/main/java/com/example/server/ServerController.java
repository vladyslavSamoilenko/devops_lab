package com.example.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class ServerController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam(defaultValue = "Unknown") String name) {
        System.out.println("SERVER: Received a request from: " + name);

        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        return "Hi, " + name + "! I`m server, my local time is: " + time;
    }
}
