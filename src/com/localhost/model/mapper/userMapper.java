package com.localhost.model.mapper;

import com.localhost.model.po.user;

public interface userMapper {
    int insert(user record);

	int insertSelective(user record);
}