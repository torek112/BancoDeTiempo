package com.zahirasoft.service;

import org.springframework.stereotype.Service;

import com.zahirasoft.model.User;

public interface UserService {

	User addUser(User user);

	void deleteUser(User user);
	
	User findUserById(Long id);
}
