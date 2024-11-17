package com.example.demo.persistence.entity;

public interface User {
    int id(int idNumber);
    void firstName(String firstName);
    String lastName(String lastName);
    String email(String email);
    String password(String password);
}
