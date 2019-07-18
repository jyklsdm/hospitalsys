package com.localhost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.localhost.model.mapper.ConstantMapper;
import com.localhost.model.po.Constant;

@Controller
public class ConstantController {
	
	@Autowired
	private ConstantMapper constantMapper;
	
	@RequestMapping(value = "/constantgetdata", method = RequestMethod.GET)
	public @ResponseBody List<Constant> getConstantData() {
		return constantMapper.getConstantData();
	}
}
