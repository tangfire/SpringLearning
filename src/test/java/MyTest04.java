import com.kuang.conf.MyConfig;
import com.kuang.pojo04.User;
import com.kuang.pojo05.Dog;
import com.kuang.pojo08.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest04 {
    @Test
    public void test17(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans17.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user.name);
    }

    @Test
    public void test18(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans18.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.search();
    }




}
