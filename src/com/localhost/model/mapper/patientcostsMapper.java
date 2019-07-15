package com.localhost.model.mapper;

import com.localhost.model.po.patientcosts;

public interface patientcostsMapper {
    int insert(patientcosts record);

    int insertSelective(patientcosts record);
}