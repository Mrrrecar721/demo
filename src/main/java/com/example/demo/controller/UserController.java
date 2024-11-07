package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value="firstName", defaultValue = "First") String firstName,
                        @RequestParam(value="lastName", defaultValue = "Last") String lastName,
                        @RequestParam(value="age", defaultValue = "00") int age) {

        //Change to a database call\
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public User postUser(User user) {
        System.out.println("User First Name: " + user.getFirstName());
        return user;
    }
}
