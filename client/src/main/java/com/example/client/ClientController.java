package com.example.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {
    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/ping-server")
    public String checkServer() {
        String url = "http://server-app:8080/hello?name=Student";

        System.out.println("CLIENT: sending to server...");

        try {
            String response = restTemplate.getForObject(url, String.class);

            System.out.println("CLIENT: received a response! -> " + response);

            return "Success! <br> Server response: <b>" + response + "</b>";
        } catch (Exception e) {
            System.out.println("CLIENT: Error! " + e.getMessage());
            return "Error: " + e.getMessage();
        }
    }
}
