package com.ssm.dao;

import com.ssm.model.Auctions;

public interface AuctionsDao {
    int deleteByPrimaryKey(Integer aucid);

    int insert(Auctions record);

    int insertSelective(Auctions record);

    Auctions selectByPrimaryKey(Integer aucid);

    int updateByPrimaryKeySelective(Auctions record);

    int updateByPrimaryKey(Auctions record);
}