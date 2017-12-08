package com.zahirasoft.mapper;

import com.zahirasoft.dto.UserDto;
import com.zahirasoft.model.User;
import org.springframework.stereotype.Component;

@Component("userConverter")
public class UserMapper {

    public UserDto convertUser2UserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setIdUser(user.getIdUser());
        userDto.setUserName(user.getUserName());
        userDto.setUserPassword(user.getUserPassword());
        userDto.setHours(user.getHours());
        userDto.setLoginDate(user.getLoginDate());
        userDto.setEmail(user.getEmail());
        userDto.setFirstTime(user.isFirstTime());
        return userDto;
    }

    public User convertUserDto2User(UserDto userDto) {
        User user = new User();
        user.setIdUser(userDto.getIdUser());
        user.setUserName(userDto.getUserName());
        user.setUserPassword(userDto.getUserPassword());
        user.setHours(userDto.getHours());
        user.setEmail(userDto.getEmail());
        user.setFirstTime(userDto.isFirstTime());
        return user;
    }

}
