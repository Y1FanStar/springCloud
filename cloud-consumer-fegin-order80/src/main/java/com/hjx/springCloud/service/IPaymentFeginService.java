package com.hjx.springCloud.service;

import com.hjx.springCloud.entities.CommonResult;
import com.hjx.springCloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author hjx
 * @date 2023/6/20 0:16
 */
@Component
@FeignClient("cloud-payment-service")
public interface IPaymentFeginService {
    @GetMapping("/payment/getOrd/{id}")
    public CommonResult getPayMentById(@PathVariable("id") Long id);


    @GetMapping("/payment/timeout")
    public String timeOut();

}
