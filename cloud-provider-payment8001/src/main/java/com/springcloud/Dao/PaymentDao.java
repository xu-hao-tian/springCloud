package com.springcloud.Dao;

import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许昊天
 * @Date: 2021/08/03/14:47
 * @Description:
 */
@Mapper
public interface PaymentDao {
    /**
     * 增
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 改     加上@Param注解，mapper中就可以采用#{}的方式把@Param注解括号内的参数进行引用
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
