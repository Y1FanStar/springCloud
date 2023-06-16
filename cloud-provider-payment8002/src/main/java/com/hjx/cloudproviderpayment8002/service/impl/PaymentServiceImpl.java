package com.hjx.cloudproviderpayment8002.service.impl;

import com.hjx.cloudproviderpayment8002.dao.PaymentDao;
import com.hjx.cloudproviderpayment8002.service.PaymentService;
import com.hjx.springCloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @author hjx
 * @date 2023/6/15 1:47
 */
@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        if (null == payment) {
            log.info("payment不可为null");
            return 0;
        } else if (StringUtils.isEmpty(payment.getSerial())) {
            return 0;
        }
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPayMentById(Long id) {
        return paymentDao.getPayMentById(id);
    }
}
