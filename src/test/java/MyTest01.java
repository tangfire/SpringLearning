import com.kuang.pojo01.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    @Test
    public void test11() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans12.xml");
        User user = (User) context.getBean("user");
        user.getCat().shout();
        user.getDog().shout();
        System.out.println(user.getStr());
    }
}
