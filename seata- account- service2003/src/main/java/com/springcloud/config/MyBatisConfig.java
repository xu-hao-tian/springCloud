package com.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许昊天
 * @Date: 2021/08/29/11:19
 * @Description:
 */
@Configuration
@MapperScan({"com.springcloud.dao"})
public class MyBatisConfig {
}
