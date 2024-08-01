package com.job.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobPortalApplication {

    public static void main(String[] args) {
        System.out.println("Started");
        SpringApplication.run(JobPortalApplication.class, args);
        System.out.println("End...");

    }
}
