package com.localhost.model.service;

public interface ConstantService {
	
	public Integer addConstant(String constantName, String constantCode, String constantTypeName);
	
	public String delete(String[] selectData);
	
	public String deleteType(String constantTypeName);
	
	public Integer additionType(String constantTypeName, String constantTypeCode);

}
