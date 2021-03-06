package com.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 这三个注解是lombok的，除了导入依赖，idea还需要安装插件（具体操作问度娘）.
 * @Data   //set/get方法
 * @AllArgsConstructor //有参构造器
 * @NoArgsConstructor  //无参构造器
 *
 * @Author: 许昊天
 * @Date: 2021/08/03/11:57
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private long id;
    private String serial;
}
