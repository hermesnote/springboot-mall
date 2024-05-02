package com.hermes.springbootmall.service.impl;

import com.hermes.springbootmall.dao.UserDao;
import com.hermes.springbootmall.dto.UserRegisterRequest;
import com.hermes.springbootmall.model.User;
import com.hermes.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
