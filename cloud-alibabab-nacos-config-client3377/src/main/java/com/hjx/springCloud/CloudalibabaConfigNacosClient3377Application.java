package com.hjx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hjx
 * @date 2023/6/26 0:55
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudalibabaConfigNacosClient3377Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaConfigNacosClient3377Application.class,args);
    }
}
