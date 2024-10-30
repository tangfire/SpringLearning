import com.kuang.pojo04.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest04 {
    @Test
    public void test17(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("beans17.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user.name);
    }

}
