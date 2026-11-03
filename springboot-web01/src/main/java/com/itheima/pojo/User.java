package com.itheima.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//注解后自动生成无参和有参构造方法，以及get和set方法，toString方法
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;
    //定义一个包含年月日和时分秒的时间类型变量updatetime

    private LocalDateTime updateTime;

}

