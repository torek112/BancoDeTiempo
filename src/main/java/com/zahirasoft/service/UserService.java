package com.zahirasoft.service;

import com.zahirasoft.dto.UserDto;
import org.springframework.stereotype.Service;

import com.zahirasoft.model.User;

public interface UserService {

	UserDto addUser(UserDto userDto);

	void deleteUser(UserDto userDto);
	void saveUser(UserDto userDto);
	
	UserDto findUserById(Long id);

	UserDto findByUsername(String username);
}
