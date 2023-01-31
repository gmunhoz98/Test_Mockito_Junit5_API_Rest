package com.teste.api.services;

import com.teste.api.domain.User;

public interface UserService {
    User findById(Integer id);
}
