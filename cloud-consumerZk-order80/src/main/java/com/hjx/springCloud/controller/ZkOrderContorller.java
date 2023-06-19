package com.hjx.springCloud.controller;

import com.hjx.springCloud.entities.CommonResult;
import com.hjx.springCloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author hjx
 * @date 2023/6/18 0:03
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class ZkOrderContorller {


    public static final String INVOKE_URL = "http://cloud-provider-service";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/getZk")
    public CommonResult get() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", CommonResult.class);
    }

}
