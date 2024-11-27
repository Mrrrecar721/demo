package com.example.demo;


import com.example.demo.components.MyComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

import java.util.HashSet;



@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

    private static final Logger logger = LoggerFactory.getLogger(
            DemoApplication.class
    );


    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        logger.info("Application started");
        MyComponent myComponent = ctx.getBean("MyComponent", MyComponent.class);
        System.out.println(myComponent);





    }

    public static void printDistinct(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!set.contains(i)) {
                System.out.println(arr[i] + " ");
                set.add(i);
            }
        }
    }

}

