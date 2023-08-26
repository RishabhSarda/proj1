package com.testing.app.api;

import java.security.MessageDigest;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.testing.app.dto.UserTable;
import com.testing.app.service.UserService;

@RestController
public class RestAPI {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String landingPage() {
		return "Welcome";
	}

	@GetMapping("/getUsers")
	public List<UserTable> getAllUser() {
		return Collections.emptyList();
	}

	@PostMapping("/getUsers")
	public List<UserTable> getUser() {
		return userService.userLogin("", "");
	}

	@PostMapping("/loginUser")
	@ResponseBody
	public String loginUser(@RequestBody Map<String, String> request) {
		String encryptedpassword = null;
		try {
			userService.userLogin(request.get("userName"), request.get("passWord"));
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.update(request.get("passWord").getBytes());
			byte[] bytes = m.digest();
			StringBuilder s = new StringBuilder();  
            for(int i=0; i< bytes.length ;i++)  
            {  
                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));  
            }  
            /* Complete hashed password in hexadecimal format */  
            encryptedpassword = s.toString();  
			return encryptedpassword;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

}
