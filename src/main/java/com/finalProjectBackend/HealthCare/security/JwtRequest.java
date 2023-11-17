package com.finalProjectBackend.HealthCare.security;

public class JwtRequest {
    private String emailAddress;
    private String password;

    // Constructors, getters, and setters

    public JwtRequest(String email, String password) {
        this.emailAddress = email;
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmail(String email) {
        this.emailAddress = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

