package com.itz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itz.model.User;
import com.itz.service.UserService;

@Controller
//@RestController
public class UserController {

	@Autowired
	private UserService userService;

	/*@ModelAttribute("user")
	public User user() {
		return new User();
	}*/
	
	//@GetMapping(value="/index")
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST,consumes= {"application/xml","application/json"})
	public @ResponseBody String addUser(@RequestBody User user) {
		boolean isAdded=userService.insert(user);
		if(isAdded) {
			return "user Added Successfully";
		}//if
		else {
			return "Failed to Add the User";
		}//else	
	}//addUser()
	
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public ResponseEntity<List<User>> showUser() {
		List<User> user=userService.showAllUser();
		System.out.println(user);
		if(user.isEmpty()) {
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<User>>(user,HttpStatus.OK);
	}//show

}// ControllerClass
