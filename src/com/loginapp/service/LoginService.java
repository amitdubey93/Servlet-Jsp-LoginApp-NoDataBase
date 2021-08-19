package com.loginapp.service;

import java.util.HashMap;

import com.loginapp.dto.User;

//import java.util.HashMap;

public class LoginService {
	HashMap<String, String> users = new HashMap<>();
	public LoginService() {
		users.put("amitd", "Amit Dubey");
		users.put("sumitd", "Sumit Dubey");
		users.put("kumitd", "Kumit Dubey");
	}

	public boolean authenticate(String userId, String password) {

		if (userId == null) {
			return false;
		}
		return true;
	}
	
	public User getUserDetails(String userId){
		User user = new User();
		user.setUserId(userId);
		user.setUserName(users.get(userId));
		return user;
	}
}
