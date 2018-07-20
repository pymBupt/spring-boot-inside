package com.example.ArrayStoreExceptionDemo;

import com.example.springboot1starter.MyHealthIndicatorAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrayStoreExceptionDemoApplication {

    public static void main(String[] args) {
        //MyHealthIndicatorAutoConfiguration myHealthIndicatorAutoConfiguration
        //    = new MyHealthIndicatorAutoConfiguration();
        //MyHealthIndicatorAutoConfiguration.class.getDeclaredAnnotation(Endpoint.class);
        SpringApplication.run(ArrayStoreExceptionDemoApplication.class, args);
        System.out.println("done");
    }
}
