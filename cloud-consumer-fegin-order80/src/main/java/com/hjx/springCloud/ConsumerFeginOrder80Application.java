package com.hjx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * openfegin 默认等1秒钟 超时会报错
 * @author hjx
 * @date 2023/6/20 0:14
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerFeginOrder80Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeginOrder80Application.class,args);
    }
}
