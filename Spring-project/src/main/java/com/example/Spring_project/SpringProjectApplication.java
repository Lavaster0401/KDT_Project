package com.example.Spring_project;

import com.example.Spring_project.config.AppConfig;
import com.example.Spring_project.domain.Users;
import com.example.Spring_project.repository.UsersRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {
	public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        UsersRepository repo = ac.getBean("usersRepository", UsersRepository.class);

        Users u = new Users();
        u.setUserId("hong123");
        u.setUserName("홍길동");
        repo.save(u);
        System.out.println(repo.findByUserIdx(1L).get().getUserName());
	}

}
