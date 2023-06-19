package com.hjx.springCloud.conifg;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * @author hjx
 * @date 2023/6/20 1:01
 */
@Configuration
public class FeginConfig {
    @Bean
    Logger.Level feginLoggerLevel(){
        return Logger.Level.FULL;
    }
}
