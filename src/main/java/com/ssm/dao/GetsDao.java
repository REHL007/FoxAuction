package com.ssm.dao;

import com.ssm.model.Gets;

public interface GetsDao {
    int deleteByPrimaryKey(Integer getid);

    int insert(Gets record);

    int insertSelective(Gets record);

    Gets selectByPrimaryKey(Integer getid);

    int updateByPrimaryKeySelective(Gets record);

    int updateByPrimaryKey(Gets record);
}