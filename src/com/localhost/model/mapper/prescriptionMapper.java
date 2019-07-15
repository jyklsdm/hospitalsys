package com.localhost.model.mapper;

import com.localhost.model.po.prescription;

public interface prescriptionMapper {
    int insert(prescription record);

    int insertSelective(prescription record);
}