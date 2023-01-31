package com.teste.api.config;

import com.teste.api.domain.User;
import com.teste.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "Gabriel", "gabriel@gmail.com", "654321");
        User u2 = new User(null, "Leticia", "leticia@gmail.com", "123456");

        repository.saveAll(List.of(u1, u2));
    }
}
