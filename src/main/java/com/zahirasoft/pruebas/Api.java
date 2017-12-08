package com.zahirasoft.pruebas;

import com.zahirasoft.dto.UserDto;
import com.zahirasoft.model.User;
import com.zahirasoft.repository.UserRepository;
import com.zahirasoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
@RequestMapping("/api")
public class Api {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public void addUser() {
        UserDto userDto = new UserDto();
        userDto.setUserName("Hector");
        userDto.setUserPassword("hector");
        userDto.setHours(0F);
        userDto.setOffers("Clases programacion");
        userDto.setLoginDate(new Timestamp(System.currentTimeMillis()));
        userService.addUser(userDto);

    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public void deleteUser() {
        UserDto userDto = userService.findUserById(2L);
        userService.deleteUser(userDto);
    }

    @RequestMapping(value = "/userModify", method = RequestMethod.GET)
    public void userModify() {

    }

}
