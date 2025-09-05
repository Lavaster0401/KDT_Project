package com.example.Spring_project.config;


import com.example.Spring_project.repository.UsersRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UsersRepository usersRepository(){
        return new UsersRepository();
    }
}
