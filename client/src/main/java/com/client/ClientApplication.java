package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {

        System.setProperty("server.port", "9083");
        SpringApplication.run(ClientApplication.class, args);
    }

}

