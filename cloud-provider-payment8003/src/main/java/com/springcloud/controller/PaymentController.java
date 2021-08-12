package com.springcloud.controller;

import com.springcloud.entities.CommonResult;
import com.springcloud.entities.Payment;
import com.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @Slf4j  //日志
 *
 * @Author: 许昊天
 * @Date: 2021/08/03/15:09
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    /**
     * springframework的DiscoveryClient（不要导错包了）
     */
    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/payment/discovery")
    public Object discovery() {
        // 获取服务列表的信息
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("******element: " + element);
        }

        // 获取CLOUD-PAYMENT-SERVICE服务的所有具体实例
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            // getService Id服务器id getHost主机名称 getPort端口号 getUrl地址
            log.info(instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        }

        return this.discoveryClient;
    }

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("******插入的数据为：" + payment);
        log.info("******插入结果：" + result);

        if (result > 0) {
            // 插入成功
            return new CommonResult(200, "插入数据库成功!" + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败!");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("******查询结果：" + payment);
        if (payment != null) {
            // 查询成功
            return new CommonResult(200, "查询成功!" + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录, 查询Id: " + id);
        }
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

    @RequestMapping("/payment/feign/timeout")
    public String timeOut() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
