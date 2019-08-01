package com.sc.sc03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Sc03UserserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Sc03UserserviceApplication.class, args);
    }

}
