package com.springcloud.dao;

import com.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许昊天
 * @Date: 2021/08/29/11:00
 * @Description:
 */
@Mapper
public interface OrderDao {
    /**
     * 1. 新建订单
     */
    void create(Order order);
    /**
     * 2. 修改订单状态, 从0改为1
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
