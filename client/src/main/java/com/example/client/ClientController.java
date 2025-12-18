package com.example.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {
    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/ping-server")
    public String checkServer() {
        String url = "http://server-app:8080/hello";
        try {
            return restTemplate.getForObject(url, String.class);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
