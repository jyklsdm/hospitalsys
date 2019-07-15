package com.localhost.model.mapper;

import com.localhost.model.po.rule;

public interface ruleMapper {
    int insert(rule record);

    int insertSelective(rule record);
}