package com.zahirasoft.pruebas;

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
        User user = new User();
        user.setUserName("Hector");
        user.setUserPassword("hector");
        user.setHours(0L);
        user.setOffers("Clases programacion");
        user.setLoginDate(new Timestamp(System.currentTimeMillis()));
        userService.addUser(user);

    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public void deleteUser() {
        User user = userService.findUserById(2L);
        userService.deleteUser(user);
    }

    @RequestMapping(value = "/userModify", method = RequestMethod.GET)
    public void userModify() {

    }

}
