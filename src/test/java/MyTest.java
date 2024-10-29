import com.kuang.pojo.Hello;
import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import com.kuang.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void test1() {
        //解析beans.xml文件 , 生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans01.xml");
        //getBean : 参数即为spring配置文件中bean的id .
        Hello hello = (Hello) context.getBean("hello");

        hello.show();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans02.xml");
        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
        serviceImpl.getUser();
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans03.xml");
        //在执行getBean的时候, user已经创建好了 , 通过无参构造
        User user = (User) context.getBean("user");
        //调用对象的方法 .
        user.show();
    }


    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans04.xml");
//        UserT user = (UserT) context.getBean("userT");
        UserT user = (UserT) context.getBean("userNew");

        user.show();
    }


    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans05.xml");

        Student student = (Student) context.getBean("student");

        System.out.println(student.getName());

    }

    @Test
    public void test6(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans06.xml");

        Student student = (Student) context.getBean("student");

//        System.out.println(student.getName());
//        System.out.println(student.getAddress());
        student.show();
    }

    @Test
    public void test7(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans07.xml");

        User user = (User) context.getBean("user");

        System.out.println(user);
    }

    @Test
    public void test8(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans08.xml");

        User user = (User) context.getBean("user");

        System.out.println(user);
    }

    @Test
    public void test9(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans09.xml");
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        System.out.println(user==user2);

        User user3 = (User) context.getBean("userSingle");
        User user4 = (User) context.getBean("userSingle");
        System.out.println(user3==user4);
    }

    @Test
    public void test10(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans10.xml");
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");

        System.out.println(user==user2);
    }




}
