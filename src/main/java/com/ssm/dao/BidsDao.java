package com.ssm.dao;

import com.ssm.model.Bids;

public interface BidsDao {
    int deleteByPrimaryKey(Integer bidid);

    int insert(Bids record);

    int insertSelective(Bids record);

    Bids selectByPrimaryKey(Integer bidid);

    int updateByPrimaryKeySelective(Bids record);

    int updateByPrimaryKey(Bids record);
}