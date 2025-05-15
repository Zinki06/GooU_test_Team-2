package com.example.demo.model;

public class User {
    private String name;
    private String email;

    // 생성자
    public User() {}
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    // Getter/Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
} 