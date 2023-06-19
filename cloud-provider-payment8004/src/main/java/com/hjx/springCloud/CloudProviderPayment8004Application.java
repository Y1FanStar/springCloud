package com.hjx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hjx
 * @date 2023/6/17 16:57
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class CloudProviderPayment8004Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8004Application.class,args);
    }
}
