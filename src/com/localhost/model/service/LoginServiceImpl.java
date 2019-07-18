package com.localhost.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.localhost.model.mapper.userMapper;
import com.localhost.model.po.user;

public class LoginServiceImpl implements LoginService{

	private user userState;
	@Autowired
	private userMapper loginService;
	
	@Override
	public int getJudgmentResult(String username, String password) {
		if (loginService.getUser(username) == null) {
			return -1;
		}
		userState = loginService.getUser(username);
		if (userState.getPassword().equals(password)) {
			return userState.getUsetype();
		}
		return -1;
	}
}
