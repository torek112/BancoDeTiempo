package com.zahirasoft.service.impl;

import com.zahirasoft.dto.UserDto;
import com.zahirasoft.mapper.UserMapper;
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

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public UserDto addUser(UserDto userDto) {
		User user = userMapper.convertUserDto2User(userDto);
		if(userDto == null) {
			return null;
		}
		if(null == findByUsername(user.getUserName())) {
			user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
			user = userRepository.save(user);
		}
		return userMapper.convertUser2UserDto(user);
	}

	@Override
	public UserDto findUserById(Long id) {
		// TODO Auto-generated method stub
		User u = userRepository.findOne(id);
		UserDto udto = userMapper.convertUser2UserDto(u);
		return udto;
	}

	@Override
	public UserDto findByUsername(String username) {
		UserDto userDto = new UserDto();
		if(null == userRepository.findByUserName(username)) {
			return null;
		} else {
			User user = userRepository.findByUserName(username);
			return userMapper.convertUser2UserDto(user);
		}

	}

	public void deleteUser(UserDto userDto) {
		User user = userMapper.convertUserDto2User(userDto);
		userRepository.delete(user);
	}

	public void saveUser(UserDto userDto) {
		User user = userMapper.convertUserDto2User(userDto);
		userRepository.save(user);
	}
}
