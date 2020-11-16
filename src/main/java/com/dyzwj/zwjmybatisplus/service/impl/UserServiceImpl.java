package com.dyzwj.zwjmybatisplus.service.impl;

import com.dyzwj.zwjmybatisplus.domain.User;
import com.dyzwj.zwjmybatisplus.mapper.UserMapper;
import com.dyzwj.zwjmybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return null;
    }
}
