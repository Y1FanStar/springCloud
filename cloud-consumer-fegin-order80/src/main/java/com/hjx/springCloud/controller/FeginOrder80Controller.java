package com.hjx.springCloud.controller;

import com.hjx.springCloud.entities.CommonResult;
import com.hjx.springCloud.entities.Payment;
import com.hjx.springCloud.service.IPaymentFeginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hjx
 * @date 2023/6/20 0:20
 */
@RestController
@Slf4j
public class FeginOrder80Controller {

    @Resource
    private IPaymentFeginService  paymentFeginService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        return paymentFeginService.getPayMentById(id);
    }

    @GetMapping("/consumer/payment/timeout")
    public String  timeoutService(){
        return paymentFeginService.timeOut();
    }
}
