package com.springcloud.service;

import com.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Feign封装了Ribbon和RestTemplate，实现负载均衡和发送请求.
 * @FeignClient(value = "CLOUD-PAYMENT-SERVICE")    作为feign的接口，找CLOUD-PAYMENT-SERVICE服务.
 *
 * @Author: 许昊天
 * @Date: 2021/08/10/17:45
 * @Description:
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    /**
     * 直接复制8001的方法
     */
    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

}