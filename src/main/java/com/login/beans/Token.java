package com.login.beans;

import org.springframework.stereotype.Component;

@Component
public class Token {
	
	
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Token [token=" + token + "]";
	}
	
	

}
