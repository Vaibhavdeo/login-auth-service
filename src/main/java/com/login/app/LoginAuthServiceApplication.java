package com.login.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.login.dao.LoginDao;

@SpringBootApplication
@ComponentScan("com")
@EnableJpaRepositories(basePackageClasses= {LoginDao.class})
@EntityScan("com.login.entities")
public class LoginAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginAuthServiceApplication.class, args);
	}
}
