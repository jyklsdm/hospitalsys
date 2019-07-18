package com.localhost.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.localhost.model.service.LoginService;

@Controller
public class loginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	@ResponseBody
	public Integer login(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Integer result = new Integer(loginService.getJudgmentResult(username, password));
		return result;
	}
}
