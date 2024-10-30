import com.kuang.pojo03.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {
    @Test
    public void test15() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans15.xml");
        User user = (User) context.getBean("user");
        user.getCat().shout();
        user.getDog().shout();
        System.out.println(user.getStr());
    }
}
