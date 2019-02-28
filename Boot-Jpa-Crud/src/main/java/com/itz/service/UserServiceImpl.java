package com.itz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itz.dao.UserDao;
import com.itz.entity.UserEntity;
import com.itz.model.User;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public boolean insert(User user) {
		// converting model object to entity obj
		UserEntity entity = new UserEntity();

		entity.setuId(user.getuId());
		entity.setuName(user.getuName());
		entity.setuAdd(user.getuAdd());

		// calling save method of jpa
		UserEntity ue = userDao.save(entity);

		return (ue.getuId() != null) ? true : false;

	}// insertMethod

	@Override
	public List<User> showAllUser() {
		List<UserEntity> en = userDao.findAll();
		List<User> users = new ArrayList<User>();

		if (!en.isEmpty()) {
			for (UserEntity entity : en) {
				User u = new User();
				u.setuId(entity.getuId());
				u.setuName(entity.getuName());
				u.setuAdd(entity.getuAdd());

				users.add(u);
			}
		} // if
		return users;

	}// showAllMethod

}
