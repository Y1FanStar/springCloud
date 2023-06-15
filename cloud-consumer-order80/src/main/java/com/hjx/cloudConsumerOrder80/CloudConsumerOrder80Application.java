package com.hjx.cloudConsumerOrder80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author hjx
 * @date 2023/6/15 22:30
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class CloudConsumerOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder80Application.class);
    }
}
