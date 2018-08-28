package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.login.beans.Token;
import com.login.beans.User;

@RestController
@CrossOrigin
public class LoginController {
	
	@Autowired
	private Token token;
	
	String userToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IlZhaWJoYXYgRGVvcmUiLCJpYXQiOjE1MTYyMzkwMjJ9.NGfcMZlP4M7oS7jXprtSGeSGxgWNhnpDp9BPpxsQHWo";
	
	@RequestMapping(value = "/api/authentication", method = RequestMethod.POST)
	public Token getAuthToken(@RequestBody User user){		
		if(user.getEmail().equals("vaibhav") && user.getPassword().equals("1234")){
			token.setToken(userToken);
			return token;
		}
		return null;
		
	}

}
