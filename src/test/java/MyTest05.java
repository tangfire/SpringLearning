import com.kuang.pojo09.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest05 {

    @Test
    public void test19(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans19.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}
