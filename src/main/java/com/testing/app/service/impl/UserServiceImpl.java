package com.testing.app.service.impl;

import java.security.MessageDigest;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.testing.app.dao.UserRepository;
import com.testing.app.dto.UserTable;
import com.testing.app.service.UserService;
//@EntityScan(basePackages = "com.testing.app.dao")
@ComponentScan(basePackages = {"com.testing.app.dao"})
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	private final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Override
	@Transactional
	public String getUserName() {
		return null;
	}

	@Override
	@Transactional
	public List<UserTable> userLogin(String userName, String uPassword) {
		try {
			LOGGER.info("Inside login user");
			MessageDigest m = MessageDigest.getInstance("MD5");
			return userRepository.findAll();
		}
		catch(Exception e) {
			LOGGER.info("Error Occured while getting user details : ", e);
			return null;
		}
	}

}
