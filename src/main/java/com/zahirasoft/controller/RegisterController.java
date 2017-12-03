package com.zahirasoft.controller;

import com.zahirasoft.dto.UserDto;
import com.zahirasoft.model.User;
import com.zahirasoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        if(!userService.findByUsername(userDto.getUserName()).getUserName().equals(userDto.getUserName())){
            model.addAttribute("result", 1);
            return "succesfullSignup";
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
