package com.itz.service;

import java.util.List;

import com.itz.model.User;

public interface UserService {
	
	public boolean insert(User user);
	
	public List<User> showAllUser();

}//UserService
