package com.itheima.dao.impl;

import cn.hutool.core.io.IoUtil;
import com.itheima.dao.userdata;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class UserdataImpl implements userdata {
    @Override
    public List<String> login() {
        Class<?> clazz = this.getClass();
        InputStream inputStream = clazz.getResourceAsStream("/user.txt");
        // 用hutool里面的readline 传入inputStream
        List<String> lines = IoUtil.readLines(inputStream, StandardCharsets.UTF_8, new ArrayList<>());
        return lines;
    }
}
