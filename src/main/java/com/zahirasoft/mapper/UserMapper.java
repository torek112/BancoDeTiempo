package com.zahirasoft.mapper;

import com.zahirasoft.dto.UserDto;
import com.zahirasoft.model.User;
import org.springframework.stereotype.Component;

@Component("userConverter")
public class UserMapper {

    public UserDto convertUser2UserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUserName(user.getUserName());
        userDto.setUserPassword(user.getUserPassword());
        userDto.setHours(user.getHours());
        userDto.setLoginDate(user.getLoginDate());
        userDto.setOffers(user.getOffers());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

    public User convertUserDto2User(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setUserName(userDto.getUserName());
        user.setUserPassword(userDto.getUserPassword());
        user.setHours(userDto.getHours());
        user.setLoginDate(userDto.getLoginDate());
        user.setOffers(userDto.getOffers());
        user.setEmail(userDto.getEmail());
        return user;
    }

}
