package com.example.Spring_project;

import com.example.Spring_project.config.AppConfig;
import com.example.Spring_project.repository.UsersRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonCheck {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        UsersRepository repo1 = ac.getBean("usersRepository", UsersRepository.class);
        UsersRepository repo2 = ac.getBean("usersRepository", UsersRepository.class);

        System.out.println("repo1 == repo2 ? " + (repo1 == repo2));
        System.out.println("repo1 id : "+ System.identityHashCode(repo1));
        System.out.println("repo2 id : "+ System.identityHashCode(repo2));
    }
}
