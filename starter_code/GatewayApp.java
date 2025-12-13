package com.revature.lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GatewayApp {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApp.class, args);
    }

    // Note: Routes are usually defined in application.yml,
    // but can be defined via @Bean RouteLocatorBuilder if preferred.
}
