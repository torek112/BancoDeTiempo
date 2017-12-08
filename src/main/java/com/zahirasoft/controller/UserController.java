package com.zahirasoft.controller;

import com.zahirasoft.dto.OffersDto;
import com.zahirasoft.dto.UserDto;
import com.zahirasoft.model.Offers;
import com.zahirasoft.repository.OffersRepository;
import com.zahirasoft.service.UserService;
import com.zahirasoft.service.impl.OffersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    OffersServiceImpl offersService;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String mainPage() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDto user = userService.findByUsername(authentication.getName());
        if(user.isFirstTime()==true) {
            return "redirect:/completeinfo";
        } else {
            return "redirect:/mainpage";
        }

    }

    @RequestMapping(value="/completeinfo", method= RequestMethod.GET)
    public String completeinfoPage(@RequestParam(name="idOffers", required = false) Long idOffers, Model model) {
        OffersDto offersDto = new OffersDto();
        model.addAttribute("offersDto", offersDto);
        return "completeinfo";
    }

    @RequestMapping(value="/completedinfo", method= RequestMethod.POST)
    public String completedinfoPage(@ModelAttribute(name="offersDto")OffersDto offersDto, Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDto user = userService.findByUsername(authentication.getName());
        if(offersDto.getDescription().equals("")) {
            model.addAttribute("result", 0);
            return "completeinfo";
        }
        user.setFirstTime(false);
        offersService.saveOffers(offersDto);
        userService.saveUser(user);
        return "mainpage";
    }

    @RequestMapping(value="/mainpage", method= RequestMethod.GET)
    public String mainpagePage() {
        return "mainpage";
    }
}
