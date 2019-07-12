package com.localhost.model.mapper;

import com.localhost.model.pojo.department;

public interface departmentMapper {
    int insert(department record);

    int insertSelective(department record);
}