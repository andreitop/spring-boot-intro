package com.andreitop.springbootintro.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleConfig implements CommandLineRunner {

    @Value("${dark.config}")
    private String darkConfig;

    @Value("${white.secret}")
    private String whiteSecret;

    @Override
    public void run(String... args) {
        System.out.println("\n\n\n" + darkConfig + " with " + whiteSecret +"\n\n\n");
    }
}
