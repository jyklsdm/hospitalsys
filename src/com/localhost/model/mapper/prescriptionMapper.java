package com.localhost.model.mapper;

import com.localhost.model.pojo.prescription;

public interface prescriptionMapper {
    int insert(prescription record);

    int insertSelective(prescription record);
}