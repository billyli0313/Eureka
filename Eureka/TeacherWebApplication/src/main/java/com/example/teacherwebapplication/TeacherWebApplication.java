package com.example.teacherwebapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TeacherWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeacherWebApplication.class, args);
    }

}
