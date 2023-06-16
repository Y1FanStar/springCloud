package com.hjx.cloudproviderpayment8002.dao;

import com.hjx.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author hjx
 * @date 2023/6/15 1:26
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPayMentById(@Param("id") Long id);
}
