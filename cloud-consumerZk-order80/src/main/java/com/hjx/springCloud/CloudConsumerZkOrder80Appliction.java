package com.hjx.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author hjx
 * @date 2023/6/18 0:00
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CloudConsumerZkOrder80Appliction {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerZkOrder80Appliction.class,args);
    }
}
