package com.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许昊天
 * @Date: 2021/08/10/11:25
 * @Description:
 */
public interface ILoadBalancer {
    /**
     *  传入具体实例的集合，返回选中的实例
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstance);
}
