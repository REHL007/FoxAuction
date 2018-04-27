package com.ssm.dao;

import com.ssm.model.Classes;

public interface ClassesDao {
    int deleteByPrimaryKey(Integer clsid);

    int insert(Classes record);

    int insertSelective(Classes record);

    Classes selectByPrimaryKey(Integer clsid);

    int updateByPrimaryKeySelective(Classes record);

    int updateByPrimaryKey(Classes record);
}