package com.hjx.SpringCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hjx
 * @date 2023/6/26 0:39
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CloudAlibabaNacosConsumerOrder83Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaNacosConsumerOrder83Application.class,args);
    }
}
