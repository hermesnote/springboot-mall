package com.hermes.springbootmall.service;

import com.hermes.springbootmall.dto.UserLoginRequest;
import com.hermes.springbootmall.dto.UserRegisterRequest;
import com.hermes.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);

}
