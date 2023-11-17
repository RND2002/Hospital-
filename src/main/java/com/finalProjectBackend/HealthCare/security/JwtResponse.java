package com.finalProjectBackend.HealthCare.security;

import lombok.Builder;

@Builder
public class JwtResponse {
    private String jwtToken;
    private String username;
    private String role;

    // Constructors, getters, and setters

//    public JwtResponse(String jwtToken, String username) {
//        this.jwtToken = jwtToken;
//        this.username = username;
//    }


    public JwtResponse(String jwtToken, String username, String role) {
        this.jwtToken = jwtToken;
        this.username = username;
        this.role = role;
    }

//    public String getJwtToken() {
//        return jwtToken;
//    }
//
//    public void setJwtToken(String jwtToken) {
//        this.jwtToken = jwtToken;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

