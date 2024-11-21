package com.example.demo.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name="USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId = -1;

    private String firstName;
    private String lastName;

    @Column(name = "USER LEVEL")
    private String userLevel;

    public User(long employeeId, String firstName, String lastName, String userLevel) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userLevel = userLevel;
    }

    public User() {

    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRole(String userLevel) {
        this.userLevel= userLevel;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "User{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userLevel='" + userLevel + '\'' +
                '}';
    }
}
