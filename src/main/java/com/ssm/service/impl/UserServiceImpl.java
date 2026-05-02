package com.ssm.service.impl;

import com.ssm.mapper.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String login(String username, String password) {
        User user = userMapper.findByUsername(username);
        if (user == null) return "用户不存在";
        if (!user.getPassword().equals(password)) return "密码错误";
        return "success";
    }

    @Override
    public String register(String username, String password) {
        User existUser = userMapper.findByUsername(username);
        if (existUser != null) return "用户名已存在";
        int rows = userMapper.insertUser(new User(username, password));
        return rows > 0 ? "success" : "注册失败";
    }
}