package com.example.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Привет от Сервера! Связь установлена.";
    }
}
