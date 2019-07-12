package com.localhost.model.mapper;

import com.localhost.model.pojo.medicaldisease;

public interface medicaldiseaseMapper {
    int insert(medicaldisease record);

    int insertSelective(medicaldisease record);
}