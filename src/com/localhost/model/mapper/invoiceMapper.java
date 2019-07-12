package com.localhost.model.mapper;

import com.localhost.model.pojo.invoice;

public interface invoiceMapper {
    int insert(invoice record);

    int insertSelective(invoice record);
}