package com.kuang.pojo02;

import org.springframework.beans.factory.annotation.Autowired;

//将User类中的set方法去掉，使用@Autowired注解
public class User {

//    @Autowired是按类型自动转配的，不支持id匹配。
//    需要导入 spring-aop的包！


//如果允许对象为null，设置required = false,默认为true
   @Autowired
   private Cat cat;
   @Autowired
   private Dog dog;

   private String str;

   public Cat getCat() {
       return cat;
  }
   public Dog getDog() {
       return dog;
  }
   public String getStr() {
       return str;
  }
}
