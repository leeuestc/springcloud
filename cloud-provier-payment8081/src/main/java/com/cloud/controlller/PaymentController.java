package com.cloud.controlller;


import com.cloud.service.PaymentService;
import domain.CommonResult;
import domain.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lichen218690
 * @date 2021/9/11 10:57 上午
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment){
        int result=paymentService.create(payment);
        if(result>0){
            return new CommonResult(200,"插入成功",payment);
        }
        return new CommonResult(100,"插入s失败");
    }

    @GetMapping("/get")
    public CommonResult select(@RequestParam Long id){
        Payment payment = paymentService.getPayment(id);
        System.out.println("hello");
        if(payment != null){
            return new CommonResult(200,"查询成功",payment);
        }
        return new CommonResult(100,"没有对应记录");
    }
}
