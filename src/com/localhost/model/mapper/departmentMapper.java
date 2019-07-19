package com.localhost.model.mapper;

import com.localhost.model.po.department;

public interface departmentMapper {
    int insert(department record);

    int insertSelective(department record);
}