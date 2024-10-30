package com.kuang.pojo03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//将User类中的set方法去掉，使用@Autowired注解
public class User {

//    @Qualifier
//    @Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配
//    @Qualifier不能单独使用。

   @Autowired
   @Qualifier(value = "cat1")
   private Cat cat;
   @Autowired
   @Qualifier(value = "dog2")
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
