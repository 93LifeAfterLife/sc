package com.sc.sc04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Sc04OrderserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sc04OrderserviceApplication.class, args);
    }

}
