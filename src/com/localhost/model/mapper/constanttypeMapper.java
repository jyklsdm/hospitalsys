package com.localhost.model.mapper;

import java.util.List;

import com.localhost.model.po.constanttype;

public interface constanttypeMapper {
    int insert(constanttype record);

    int insertSelective(constanttype record);
    
    public int deleteData(String constantTypeName);
    
    public List<constanttype> getData();
}