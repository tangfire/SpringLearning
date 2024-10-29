package com.kuang.dao.impl;

import com.kuang.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
   @Override
   public void getUser() {
       System.out.println("Oracle获取用户数据");
  }
}
