package com.ripplestreet.usermvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ripplestreet.usermvc.dao.UserDao;
import com.ripplestreet.usermvc.dto.User;
@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public User save(User user) {
		return userDao.save(user);
	}
	
	public List<User> view(){
		return userDao.view();
	}
}
