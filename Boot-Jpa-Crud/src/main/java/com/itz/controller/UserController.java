package com.itz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itz.model.User;
import com.itz.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@ModelAttribute("user")
	public User user() {
		return new User();
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/store",method=RequestMethod.POST)
	public String storeUser(Model model, @ModelAttribute("user")User u) {
		boolean isInserted=userService.insert(u);
		if(isInserted) {
			model.addAttribute("sMg","Book Stored Successfully");
		}
		else {
			model.addAttribute("eMsg","Failed to Store");
		}
		return "index";
	}// storeUser()

	
	@RequestMapping(value="/viewUser",method=RequestMethod.GET)
	public String viewUser(Model model) {
		List<User> userList=userService.showAllUser();
		model.addAttribute("users",userList);
		return "showUser";
	}// showMethod()

}// ControllerClass
