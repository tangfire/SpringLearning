import com.kuang.pojo10.UserService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyTest06 {
    @Test
    public void test20(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans20.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }




}
