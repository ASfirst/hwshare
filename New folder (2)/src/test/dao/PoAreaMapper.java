package test.dao;

import test.model.PoArea;

public interface PoAreaMapper {
    int deleteByPrimaryKey(Long fdId);

    int insert(PoArea record);

    int insertSelective(PoArea record);

    PoArea selectByPrimaryKey(Long fdId);

    int updateByPrimaryKeySelective(PoArea record);

    int updateByPrimaryKey(PoArea record);
}