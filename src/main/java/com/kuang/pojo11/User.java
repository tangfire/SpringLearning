package com.kuang.pojo11;


import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
   private int id;  //id
   private String name;   //姓名
   private String pwd;   //密码
}
