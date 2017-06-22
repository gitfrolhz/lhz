package com.user.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Dao.UserDao;
import com.user.Service.UserService;

@Service
public class UserServiceImpl  implements  UserService {
	
	@Autowired
	private UserDao userDao;

}
