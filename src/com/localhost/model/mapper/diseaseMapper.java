package com.localhost.model.mapper;

import com.localhost.model.pojo.disease;

public interface diseaseMapper {
    int insert(disease record);

    int insertSelective(disease record);
}