package com.localhost.model.mapper;

import com.localhost.model.pojo.drugs;

public interface drugsMapper {
    int insert(drugs record);

    int insertSelective(drugs record);
}