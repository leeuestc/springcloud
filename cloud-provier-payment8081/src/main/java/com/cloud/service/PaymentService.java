package com.cloud.service;

import com.cloud.dao.PaymentMapper;


import domain.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lichen218690
 * @date 2021/9/11 10:54 上午
 */
@Service
public class PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    public int create(Payment payment){
        return paymentMapper.create(payment);
    }
    public Payment getPayment(Long id){
        return paymentMapper.getPaymentById(id);
    }
}
