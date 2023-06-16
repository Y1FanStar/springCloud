package com.hjx.cloudproviderpayment8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hjx
 * @date 2023/6/15 22:21
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudProviderPayment8001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8001Application.class, args);
    }
}
