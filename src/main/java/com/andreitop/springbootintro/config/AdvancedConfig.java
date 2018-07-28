package com.andreitop.springbootintro.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@ConfigurationProperties("custom-config")
public class AdvancedConfig {

    private boolean used;

    private InetAddress primaryAddress;

    private final SpecificOptions specificOptions = new SpecificOptions();

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public InetAddress getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(InetAddress primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public SpecificOptions getSpecificOptions() {
        return specificOptions;
    }

    public static class SpecificOptions {

        private String mainUser;

        private List<String> continents = new ArrayList<>(Collections.singletonList("EUROPE"));

        public String getMainUser() {
            return mainUser;
        }

        public void setMainUser(String mainUser) {
            this.mainUser = mainUser;
        }

        public List<String> getContinents() {
            return continents;
        }

        public void setContinents(List<String> continents) {
            this.continents = continents;
        }
    }

}