import com.kuang.pojo10.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest06 {
    @Test
    public void test20(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans20.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }




}
