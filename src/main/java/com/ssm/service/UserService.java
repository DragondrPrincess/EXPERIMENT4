package com.ssm.service;

public interface UserService {
    // 登录校验
    String login(String username, String password);

    // 注册校验
    String register(String username, String password);
}