package com.kuang.pojo;

public class User {

   private String name;
   private int age;


   public User() {
       System.out.println("user无参构造方法");
  }

//    public User(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    // 运行test8, 这个构造函数才能运行，而上面的构造函数会报错
  public User(int age,String name) {
       this.age = age;
       this.name = name;
  }

   public void setName(String name) {
       this.name = name;
  }

  public void setAge(int age) {
       this.age = age;
   }

   public void show(){
       System.out.println("name="+ name );
  }

  @Override
  public String toString() {
       return "User{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
   }

}
