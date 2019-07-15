package com.localhost.model.mapper;

import com.localhost.model.po.prescriptiondetailed;

public interface prescriptiondetailedMapper {
    int insert(prescriptiondetailed record);

    int insertSelective(prescriptiondetailed record);
}