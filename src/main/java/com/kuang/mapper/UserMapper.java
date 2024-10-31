package com.kuang.mapper;

import com.kuang.pojo11.User;

import java.io.IOException;
import java.util.List;


public interface UserMapper {
   public List<User> selectUser() throws IOException;

   //添加一个用户
   int addUser(User user) throws IOException;

   //根据id删除用户
   int deleteUser(int id) throws IOException;

}
