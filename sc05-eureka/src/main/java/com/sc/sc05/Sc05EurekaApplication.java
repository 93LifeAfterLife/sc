package com.sc.sc05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Sc05EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sc05EurekaApplication.class, args);
    }

}
