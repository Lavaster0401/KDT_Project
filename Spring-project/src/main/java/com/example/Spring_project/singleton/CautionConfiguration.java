package com.example.Spring_project.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CautionConfiguration {
    @Bean
    public SingletonCautionService singletonCautionService() {
        return new SingletonCautionService();
    }
}
