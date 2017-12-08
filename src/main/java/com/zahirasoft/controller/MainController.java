package com.zahirasoft.controller;

import com.zahirasoft.dto.UserDto;
import com.zahirasoft.model.User;
import com.zahirasoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {


	
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/error", method=RequestMethod.GET)
	public String errorPage() {
		return "error";
	}

	@RequestMapping(value="/help", method=RequestMethod.GET)
	public String helpPage() {
		return "help";
	}

	@RequestMapping(value="/contribute", method=RequestMethod.GET)
	public String contributePage() {
		return "contribute";
	}

	@RequestMapping(value="/contact", method=RequestMethod.GET)
	public String contactPage() {
		return "contact";
	}

	@RequestMapping(value="/userdetails", method=RequestMethod.GET)
	public String userdetailsPage() {
		return "userdetails";
	}
	

}
