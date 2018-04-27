package com.ssm.dao;

import com.ssm.model.UserCmt;

public interface UserCmtDao {
    int deleteByPrimaryKey(Integer cmtid);

    int insert(UserCmt record);

    int insertSelective(UserCmt record);

    UserCmt selectByPrimaryKey(Integer cmtid);

    int updateByPrimaryKeySelective(UserCmt record);

    int updateByPrimaryKey(UserCmt record);
}