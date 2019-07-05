package com.hwagain.sp.policy.mapper;

import com.hwagain.sp.policy.entity.PoArea;

public interface PoAreaMapper {
    int deleteByPrimaryKey(Long fdId);

    int insert(PoArea record);

    int insertSelective(PoArea record);

    PoArea selectByPrimaryKey(Long fdId);

    int updateByPrimaryKeySelective(PoArea record);

    int updateByPrimaryKey(PoArea record);
}