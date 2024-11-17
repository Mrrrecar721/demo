package com.example.demo;

import com.example.demo.components.MyComponent;
import com.example.demo.persistence.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        MyComponent myComponent = ctx.getBean("MyComponent", MyComponent.class);
        System.out.println(myComponent);

        User user = ctx.getBean("user", User.class);
        user.firstName("Rich");
    }

}

