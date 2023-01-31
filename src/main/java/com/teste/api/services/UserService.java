package com.teste.api.services;

import com.teste.api.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);

    List<User> findAll();
}
