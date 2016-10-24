import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/18.
 */
//// SpringJUnit支持，由此引入Spring-Test框架支持！

/*@RunWith(SpringJUnit4ClassRunner.class)*/
///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。

@RunWith(SpringJUnit4ClassRunner.class)
public class redisTest {
    private static String url;
    private static Map<String, String> headMap = new HashMap<String, String>();


    @Test
    public void redis() {

    }


}
