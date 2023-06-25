package com.hjx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hjx
 * @date 2023/6/24 19:17
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudServiceGateWay9527 {
    public static void main(String[] args) {
        SpringApplication.run(CloudServiceGateWay9527.class,args);
    }
}
