package com.localhost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.localhost.model.mapper.ConstantMapper;
import com.localhost.model.po.Constant;
import com.localhost.model.service.ConstantService;
import com.localhost.utils.Jurisdiction;

@Controller
@RequestMapping("/constant")
public class ConstantController {

	@Autowired
	private ConstantMapper constantMapper;
	@Autowired
	private ConstantService constantService;

	@RequestMapping(value = "/getdata", method = RequestMethod.GET)
	@Jurisdiction(jurisdiction = 1)
	public @ResponseBody List<Constant> getConstantData() {
		return constantMapper.getConstantData();
	}

	@RequestMapping(value = "/searchConstantData", method = RequestMethod.GET)
	@Jurisdiction(jurisdiction = 1)
	public @ResponseBody List<Constant> searchConstantData(String selectType, String selectText) {
		List<Constant> state = constantMapper.getConstantData();
		for (int i = 0; i < state.size(); i++) {
			switch (selectType) {
			case "0":
				if (state.get(i).getConstantname().equals(selectText)) {
					continue;
				}
				break;
			case "1":
				if (state.get(i).getConstantcode().equals(selectText)) {
					continue;
				}
				break;
			case "2":
				if (state.get(i).getConstantTypeName().equals(selectText)) {
					continue;
				}
				break;
			case "3":
				if (state.get(i).getConstantTypeCode().equals(selectText)) {
					continue;
				}
				break;
			default:
				continue;
			}
			state.remove(i);
			i--;
		}
		return state;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@Jurisdiction(jurisdiction = 1)
	public @ResponseBody String delete(String[] selectData) {
		String result = "true";
		result = constantService.delete(selectData);
		return "{\"result\":" + result + "}";
	}
	
	@RequestMapping(value = "/deleteType", method = RequestMethod.POST)
	@Jurisdiction(jurisdiction = 1)
	public @ResponseBody String deleteType(String constantTypeName) {
		String result = "true";
		result = constantService.deleteType(constantTypeName);
		return "{\"result\":" + result + "}";
	}
	
	@RequestMapping(value = "/additionType", method = RequestMethod.POST)
	@Jurisdiction(jurisdiction = 1)
	public @ResponseBody String additionType(String constantTypeName, String constantTypeCode) {
		Integer result = 1;
		result = constantService.additionType(constantTypeName, constantTypeCode);
		return "{\"result\":" + result.toString() + "}";
	}
	
	@RequestMapping(value = "/addConstant", method = RequestMethod.POST)
	@Jurisdiction(jurisdiction = 1)
	public @ResponseBody String addConstant(String constantName, String constantCode, String constantTypeName) {
		Integer result = 1;
		result = constantService.addConstant(constantName, constantCode, constantTypeName);
		return "{\"result\":" + result + "}";
	}
}
