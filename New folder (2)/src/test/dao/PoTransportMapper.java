package test.dao;

import test.model.PoTransport;

public interface PoTransportMapper {
    int deleteByPrimaryKey(Long fdId);

    int insert(PoTransport record);

    int insertSelective(PoTransport record);

    PoTransport selectByPrimaryKey(Long fdId);

    int updateByPrimaryKeySelective(PoTransport record);

    int updateByPrimaryKey(PoTransport record);
}