package com.testing.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.testing.app.dto.UserTable;

@Service
public interface UserService {

	public String getUserName();

	public List<UserTable> userLogin(String userName, String uPassword);

}
