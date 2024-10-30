import com.kuang.pojo02.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
    public void test14() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans14.xml");
        User user = (User) context.getBean("user");
        user.getCat().shout();
        user.getDog().shout();
        System.out.println(user.getStr());
    }


}
