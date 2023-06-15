package com.hjx.cloudConsumerOrder80.controller;

import com.hjx.springCloud.entities.CommonResult;
import com.hjx.springCloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author hjx
 * @date 2023/6/15 22:32
 */
@RestController
@Slf4j
@RequestMapping("/consumer/payment")
public class OrderController {

    public static String PAY_MENT_URL = "http://127.0.0.1:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/create")
    public CommonResult create(Payment payment) {
        return restTemplate.postForObject(PAY_MENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAY_MENT_URL + "/payment/getOrd/" + id, CommonResult.class);
    }

}
