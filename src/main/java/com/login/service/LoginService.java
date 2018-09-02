package com.login.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.login.dao.LoginDao;
import com.login.entities.UserEntity;


@Component
public class LoginService {

	@Autowired
	private LoginDao dao;

	public boolean getUser(String email, String password) {

		List<UserEntity> user = dao.findByEmail(email);
		if (user.get(0).getEmail().equals(email) && user.get(0).getPassword().equals(password)) {
			return true;
		}
		return false;

	}

}
