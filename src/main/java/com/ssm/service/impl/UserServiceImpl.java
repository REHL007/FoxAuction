package com.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.ssm.dao.UserDao;
import com.ssm.model.User;
import com.ssm.service.IUserService;


@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserDao userDao;

    public User getUserById(String userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

}
