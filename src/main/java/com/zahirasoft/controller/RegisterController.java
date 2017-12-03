package com.zahirasoft.controller;

import com.zahirasoft.dto.UserDto;
import com.zahirasoft.model.User;
import com.zahirasoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@Controller
public class RegisterController {

    @Autowired
    UserService userService;

    @RequestMapping("/signup")
    private String redirectRegisterForm(@RequestParam(name="id", required = false) Long id, Model model) {
        UserDto userDto = new UserDto();
        if(id != 0) {
            userDto = userService.findUserById(id);
        }
        model.addAttribute("userDto", userDto);
        return "signup";
    }

    @PostMapping("/adduser")
    public String addContact(@ModelAttribute(name="userDto") UserDto userDto, Model model){
        if(userService.findByUsername(userDto.getUserName()) == null){
            userDto.setHours(0L);
            userDto.setLoginDate(new Timestamp(System.currentTimeMillis()));
            userService.addUser(userDto);
            model.addAttribute("register", 0);
            return "login";
        }
        else {
            model.addAttribute("result", 0);
            return "signup";
        }

    }

    @RequestMapping("/succesfullSignup")
    public String succesfullSignup(@RequestParam Model model){
        return "succesfullSignup";
    }

}
