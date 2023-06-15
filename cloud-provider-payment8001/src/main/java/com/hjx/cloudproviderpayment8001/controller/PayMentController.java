package com.hjx.cloudproviderpayment8001.controller;

import com.hjx.cloudproviderpayment8001.entities.CommonResult;
import com.hjx.cloudproviderpayment8001.entities.Payment;
import com.hjx.cloudproviderpayment8001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author hjx
 * @date 2023/6/15 1:49
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PayMentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(Payment payment){
        int i = paymentService.create(payment);
        log.info("*********结果"+i);
        if (0<i){
           return new CommonResult(200,"success",i);
        }else {
            return new CommonResult(444,"fail",null);
        }
    }

    @GetMapping("/getOrd/{id}")
    public CommonResult getPayMentById(@PathVariable("id") Long id){
        Payment payMentById = paymentService.getPayMentById(id);
        log.info("*********结果"+payMentById+"************");
        if (null==payMentById){

            return new CommonResult(444,"fail",null);
        }else {
            return new CommonResult(200,"success",payMentById);
        }
    }

}
