package com.kuang.service.impl;

import com.kuang.dao.UserDao;
import com.kuang.dao.impl.UserDaoImpl;
import com.kuang.service.UserService;

public class UserServiceImpl implements UserService {
   private UserDao userDao ;

    // 利用set实现
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

   @Override
   public void getUser() {
       userDao.getUser();
  }
}
