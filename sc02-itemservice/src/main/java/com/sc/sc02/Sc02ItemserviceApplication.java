package com.sc.sc02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Sc02ItemserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sc02ItemserviceApplication.class, args);
    }

}
