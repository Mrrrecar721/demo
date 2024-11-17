package com.example.demo.components;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class MyComponent {
    private final LocalTime ts= LocalTime.now();

    public MyComponent() {
        System.out.printf("MyComponent Constructor at: %s\n", ts);

    }

    @Override
    public String toString() { return String.format("MyComponent bean created at [ts=%s]\n", ts); }
}