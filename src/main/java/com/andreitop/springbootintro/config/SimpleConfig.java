package com.andreitop.springbootintro.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SimpleConfig implements CommandLineRunner {

    @Value("${dark.config}")
    private String darkConfig;

    @Value("${white.secret}")
    private String whiteSecret;

    @Autowired
    private Environment env;

    private AdvancedConfig advancedConfig;

    @Autowired
    public void setAdvancedConfig(AdvancedConfig advancedConfig) {
        this.advancedConfig = advancedConfig;
    }

    @Override
    public void run(String... args) {
        System.out.println("\n\n\n" + darkConfig + " with " + whiteSecret);
        System.out.println("Environment: " + env.getProperty("custom-config.used"));
        System.out.println("AdvancedConfig: " + advancedConfig.getSpecificOptions().getContinents() +"\n\n\n");

    }
}
