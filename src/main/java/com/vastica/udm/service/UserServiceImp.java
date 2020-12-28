package com.vastica.udm.service;

import com.vastica.udm.dao.UserDao;
import com.vastica.udm.dao.UserDaoImp;
import com.vastica.udm.model.User;

public class UserServiceImp implements UserService {

	UserDao userDao = new UserDaoImp();
	@Override
	public int saveUserInfo(User user) {
		
		return userDao.saveUserInfo(user);
	}

}
