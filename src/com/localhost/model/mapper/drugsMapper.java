package com.localhost.model.mapper;

import com.localhost.model.po.drugs;

public interface drugsMapper {
    int insert(drugs record);

    int insertSelective(drugs record);
}