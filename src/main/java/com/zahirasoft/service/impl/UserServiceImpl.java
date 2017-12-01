package com.zahirasoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.zahirasoft.model.User;
import com.zahirasoft.repository.UserRepository;
import com.zahirasoft.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public User addUser(User user) {
		User u = userRepository.save(user);
		user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
		return userRepository.save(user);
	}

	@Override
	public User findUserById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findOne(id);
	}

	@Override
	public User findByUsername(String username) {
		User user = userRepository.findByUserName(username);
		return user;
	}


	public void deleteUser(User user) {
		userRepository.delete(user);
	}
}
