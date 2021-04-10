package com.pay.my.budy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pay.my.budy.model.User;

@Controller
public class MainController {
	
	@Autowired
	User user ;
	
	@GetMapping(value = "/")
	public String rootController() {
		
		return "/layouts/index";
		
	}
	
	
	@GetMapping(value = "/home")
	public String homeController() {
		
		return "/layouts/index";
		
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String loginController(Model model) {
		
		model.addAttribute("user", user);
		return "/layouts/login";
		
	}
	
	@PostMapping(value = "/login")
	public String submitFormLogin(@ModelAttribute("user") User user) {
				
		return "/layouts/loginSuccess";
		
	}
	
	
	@GetMapping(value = "/contact")
	public String contactController() {
		
		return "/layouts/contact";
		
	}
	
	@GetMapping(value = "/transfert")
	public String transfertController() {
		
		return "/layouts/transfert";
		
	}

}
