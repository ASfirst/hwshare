package com.hwagain.sp.policy.mapper;

import com.hwagain.sp.policy.entity.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Long fdId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long fdId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}