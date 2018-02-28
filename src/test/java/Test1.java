import com.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by ZhaGuolong on 2018/2/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class Test1 {
    @Value("${author.realname}")
    private String realname;

    @Value("${author.nickname}")
    private String nickname;

    @Test
    public void test1() throws Exception {
        System.out.println("real_name : " + realname);
        System.out.println("nick_name : " + nickname);
    }

    @Value("${author.intro}")
    private String intro;

    @Test
    public void test2() throws Exception {
        System.out.println("intro : " + intro);
    }

    @Value("${environment.password}")
    private String password;

    @Test
    public void test3() throws Exception {
        System.out.println("environment password : " + password);
    }

}
