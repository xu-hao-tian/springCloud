package com.springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 许昊天
 * @Date: 2021/08/29/14:58
 * @Description:
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
