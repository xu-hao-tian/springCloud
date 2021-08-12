package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @EnableFeignClients  启用Feign功能.
 *
 * @Author: 许昊天
 * @Date: 2021/08/12/10:05
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
public class OpenFeignMainOrder80 {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignMainOrder80.class, args);
    }
}
