package com.zahirasoft.controller;

import org.springframework.stereotype.Controller;
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
	

}
