package com.kuang.pojo04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user")
// 相当于配置文件中 <bean id="user" class="当前注解的类"/>
public class User {
//   public String name = "秦疆";

//   @Value("秦疆")
   // 相当于配置文件中 <property name="name" value="秦疆"/>
   public String name;


   @Value("秦疆")
   public void setName(String name) {
      this.name = name;
   }
}
