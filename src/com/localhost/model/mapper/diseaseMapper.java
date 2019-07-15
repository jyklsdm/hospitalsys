package com.localhost.model.mapper;

import com.localhost.model.po.disease;

public interface diseaseMapper {
    int insert(disease record);

    int insertSelective(disease record);
}