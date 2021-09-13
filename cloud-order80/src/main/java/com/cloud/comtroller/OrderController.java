package com.cloud.comtroller;


import domain.CommonResult;
import domain.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**restTemplate 客户端模板工具集
 * @author lichen218690
 * @date 2021/9/11 2:07 下午
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {
    public static final String url= "http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(url+"payment/create",payment,CommonResult.class);
    }
    @GetMapping("/get")
    public CommonResult<Payment> getPayment(@RequestParam Long id){
        return restTemplate.getForObject(url+"payment/get?id="+id,CommonResult.class);
    }
}
