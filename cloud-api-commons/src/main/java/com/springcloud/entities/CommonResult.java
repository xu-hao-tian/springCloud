package com.springcloud.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回给前端的通用json数据串.
 * @Data   //set/get方法
 * @AllArgsConstructor //有参构造器
 * @NoArgsConstructor  //无参构造器
 *
 * @Author: 许昊天
 * @Date: 2021/08/03/14:15
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    /**
     * 泛型，对应类型的json数据
     */
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

}