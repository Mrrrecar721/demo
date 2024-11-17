package com.example.demo.persistence.entity;

public class UserImp implements User {

    private User user;

    @Override
    public int id(int idNumber) {
        System.out.println("id: " + idNumber);
        return 0;
    }

    @Override
    public void firstName(String firstName) {
        System.out.println("firstName: " + firstName);
    }

    @Override
    public String lastName(String lastName) {
        System.out.println("lastName: " + lastName);
        return "";
    }

    @Override
    public String email(String email) {
        System.out.println("email: " + email);
        return "";
    }

    @Override
    public String password(String password) {
        return "";
    }

    public void getFirstName(){
        System.out.println("firstName: " + firstName);
    }
}
