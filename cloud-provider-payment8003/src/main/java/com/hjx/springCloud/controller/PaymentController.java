package com.hjx.springCloud.controller;

import com.hjx.springCloud.CloudProviderPayment8003Application;
import com.hjx.springCloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author hjx
 * @date 2023/6/17 17:07
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/zk")
    public CommonResult paymentZk() {
        log.info(CloudProviderPayment8003Application.class.getName());
        return new CommonResult<>(200, "Zookeeper " + port + "/t" + UUID.randomUUID());
//        return  "Zookeeper " + port + "/t" + UUID.randomUUID();
    }

}
