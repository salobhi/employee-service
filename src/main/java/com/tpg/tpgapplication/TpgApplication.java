package com.tpg.tpgapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TpgApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpgApplication.class, args);
    }

}
