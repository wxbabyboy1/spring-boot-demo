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
public class YamlTest {
    @Value("${author.email}")
    private String email;
    @Value("${author.blog}")
    private String blog;

    @Test
    public void test4() throws Exception {
        System.out.println("email : " + email);
        System.out.println("blog : " + blog);
    }
}
