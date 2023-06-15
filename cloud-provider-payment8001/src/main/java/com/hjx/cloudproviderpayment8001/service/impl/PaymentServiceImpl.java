package com.hjx.cloudproviderpayment8001.service.impl;

import com.hjx.cloudproviderpayment8001.dao.PaymentDao;
import com.hjx.cloudproviderpayment8001.entities.Payment;
import com.hjx.cloudproviderpayment8001.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hjx
 * @date 2023/6/15 1:47
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
     return    paymentDao.create(payment);
    }

    @Override
    public Payment getPayMentById(Long id) {
      return   paymentDao.getPayMentById(id);
    }
}
