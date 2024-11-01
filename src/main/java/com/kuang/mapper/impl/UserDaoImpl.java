package com.kuang.mapper.impl;

import com.kuang.mapper.UserMapper;
import com.kuang.pojo11.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoImpl  implements UserMapper {





   //增加一些操作
   public List<User> selectUser() throws IOException {

       SqlSession sqlSession = MybatisUtils.getSqlSession();

       User user = new User(4,"xiaoming","123456");
       UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       mapper.addUser(user);
       mapper.deleteUser(4);
       sqlSession.commit(); // 添加这一行以提交事务
       return mapper.selectUser();
  }

   //新增
   public int addUser(User user) throws IOException {
       SqlSession sqlSession = MybatisUtils.getSqlSession();


       UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       return mapper.addUser(user);
  }
   //删除
   public int deleteUser(int id) throws IOException {
       SqlSession sqlSession = MybatisUtils.getSqlSession();

       UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       return mapper.deleteUser(id);
  }

}