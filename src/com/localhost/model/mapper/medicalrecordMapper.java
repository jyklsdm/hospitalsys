package com.localhost.model.mapper;

import com.localhost.model.pojo.medicalrecord;

public interface medicalrecordMapper {
    int insert(medicalrecord record);

    int insertSelective(medicalrecord record);
}