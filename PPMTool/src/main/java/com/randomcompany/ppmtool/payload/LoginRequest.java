package com.randomcompany.ppmtool.payload;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
	@NotBlank(message = "username is required")
	private String username;
	@NotBlank(message = "password is required")
	private String password;
	
	LoginRequest() {}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
