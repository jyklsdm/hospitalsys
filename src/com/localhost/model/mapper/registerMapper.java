package com.localhost.model.mapper;

import com.localhost.model.pojo.register;

public interface registerMapper {
    int insert(register record);

    int insertSelective(register record);
}