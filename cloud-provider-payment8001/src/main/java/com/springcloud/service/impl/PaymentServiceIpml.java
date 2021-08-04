package com.springcloud.service.impl;

import com.springcloud.Dao.PaymentDao;
import com.springcloud.entities.Payment;
import com.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许昊天
 * @Date: 2021/08/03/15:03
 * @Description:
 */
@Service
public class PaymentServiceIpml implements PaymentService {
    /**
     * @Autowired也可以
     * @Resource和@Autowired注解都是用来实现依赖注入的。只是@AutoWried按by type自动注入，
     * 而@Resource默认按byName自动注入。
     */
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
