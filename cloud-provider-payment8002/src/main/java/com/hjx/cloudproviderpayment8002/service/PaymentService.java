package com.hjx.cloudproviderpayment8002.service;

import com.hjx.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author hjx
 * @date 2023/6/15 1:47
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPayMentById(@Param("id") Long id);
}
