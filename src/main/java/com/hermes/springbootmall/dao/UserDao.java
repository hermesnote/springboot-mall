package com.hermes.springbootmall.dao;

import com.hermes.springbootmall.dto.UserRegisterRequest;
import com.hermes.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);

}
