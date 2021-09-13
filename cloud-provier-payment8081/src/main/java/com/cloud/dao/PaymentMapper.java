package com.cloud.dao;






import domain.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author lichen218690
 * @date 2021/9/11 10:27 上午
 */
@Mapper
public interface PaymentMapper {
     int create(Payment payment);
     Payment getPaymentById(@Param("id") Long id);
}
