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
public class RandomTest {
    @Value("${rand.str}")
    private String randStr;
    @Value("${rand.intid}")
    private int randIntid;
    @Value("${rand.longid}")
    private long randLongid;
    @Value("${rand.number}")
    private int randNumber;
    @Value("${rand.range}")
    private String randRange;

    @Test
    public void test3() throws Exception {
        System.out.println("rand.str : " + randStr);
        System.out.println("rand.intid : " + randIntid);
        System.out.println("rand.longid : " + randLongid);
        System.out.println("rand.number : " + randNumber);
        System.out.println("rand.range : " + randRange);
    }
}
