package com.localhost.model.mapper;

import com.localhost.model.pojo.prescriptiondetailed;

public interface prescriptiondetailedMapper {
    int insert(prescriptiondetailed record);

    int insertSelective(prescriptiondetailed record);
}