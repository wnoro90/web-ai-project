package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.Service;
import com.itheima.service.impl.ServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
public class Respond {
    private Service service=new ServiceImpl();
    @RequestMapping("/list")
    public List<User> userlist() throws ParseException {
        return service.service();

    }
}
