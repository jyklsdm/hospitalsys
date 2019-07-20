package com.localhost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.localhost.model.mapper.ConstantMapper;
import com.localhost.model.mapper.constantitemMapper;
import com.localhost.model.mapper.constanttypeMapper;
import com.localhost.model.po.Constant;
import com.localhost.model.po.constanttype;
import com.localhost.utils.Jurisdiction;

@Controller
@RequestMapping("/constant")
public class ConstantController {

	@Autowired
	private ConstantMapper constantMapper;
	@Autowired
	private constantitemMapper constantItemMapper;
	@Autowired
	private constanttypeMapper constantTypeMapper;

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
		int deleteNumber = 0;
		for (int i = 0; i < selectData.length; i++) {
			if (constantItemMapper.deleteData(Integer.valueOf(selectData[i])) != 0) {
				deleteNumber++;
			}
		}
		if (deleteNumber == 0) {
			result = "false";
		}
		return "{\"result\":" + result + "}";
	}
	
	@RequestMapping(value = "/deleteType", method = RequestMethod.POST)
	@Jurisdiction(jurisdiction = 1)
	public @ResponseBody String deleteType(String constantTypeName) {
		String result = "true";
		if (constantTypeMapper.deleteData(constantTypeName) == 0) {
			result = "false";
		}
		return "{\"result\":" + result + "}";
	}
	
	@RequestMapping(value = "/additionType", method = RequestMethod.POST)
	@Jurisdiction(jurisdiction = 1)
	public @ResponseBody String additionType(String constantTypeName, String constantTypeCode) {
		int result = 1;
		List<constanttype> constantTypeData = constantTypeMapper.getData();
		for (int i = 0; i < constantTypeData.size(); i++) {
			if (constantTypeData.get(i).getConstanttypename().equals(constantTypeName)) {
				return "{\"result\":" + 0 + "}";
			}
			if (constantTypeData.get(i).getConstanttypecode().equals(constantTypeCode)) {
				return "{\"result\":" + (-1) + "}";
			}
		}
		constanttype constantType = new constanttype();
		constantType.setDelmark(new Integer(1));
		constantType.setConstanttypename(constantTypeName);
		constantType.setConstanttypecode(constantTypeCode);
		constantTypeMapper.insert(constantType);
		return "{\"result\":" + result + "}";
	}
}
