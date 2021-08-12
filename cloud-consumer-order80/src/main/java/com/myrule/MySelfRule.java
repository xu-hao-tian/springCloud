package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许昊天
 * @Date: 2021/08/10/10:28
 * @Description:
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myIRule() {
        return new RandomRule();
    }
}
