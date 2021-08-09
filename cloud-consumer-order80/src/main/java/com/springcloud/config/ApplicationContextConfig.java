package com.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 往容器中添加一个RestTemplate
 * RestTemplate提供了多种便捷访问远程http访问的方法.
 * @LoadBalanced 开启负载均衡功能.
 *
 * @Author: 许昊天
 * @Date: 2021/08/04/10:18
 * @Description:
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}