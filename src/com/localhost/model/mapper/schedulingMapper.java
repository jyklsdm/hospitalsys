package com.localhost.model.mapper;

import com.localhost.model.po.scheduling;

public interface schedulingMapper {
    int insert(scheduling record);

    int insertSelective(scheduling record);
}