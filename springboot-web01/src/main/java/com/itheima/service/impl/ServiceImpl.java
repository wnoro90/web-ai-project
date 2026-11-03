package com.itheima.service.impl;

import com.itheima.dao.impl.UserdataImpl;
import com.itheima.dao.userdata;
import com.itheima.pojo.User;
import com.itheima.service.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class ServiceImpl implements Service {
    private userdata ud = new UserdataImpl();
    @Override
    public List<User> service() {
        List<String> login = ud.login();
        List<User> userList = login.stream().map(line -> {
            String[] arr = line.split(",");
            User user = new User();
            user.setId(Integer.parseInt(arr[0]));
            user.setUsername(arr[1]);
            user.setPassword(arr[2]);
            user.setName(arr[3]);
            user.setAge(Integer.parseInt(arr[4]));
            user.setUpdateTime(LocalDateTime.parse(arr[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            return user;
        }).toList();
        return userList;
    }
}
