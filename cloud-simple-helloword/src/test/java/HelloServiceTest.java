import cloud.simple.hello.controller.AnaliseJsonController;
import cloud.simple.hello.utils.HttpUtils;
import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/18.
 */
//// SpringJUnit支持，由此引入Spring-Test框架支持！

/*@RunWith(SpringJUnit4ClassRunner.class)*/
///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。


public class HelloServiceTest {
    private static String url;
    private static Map<String, String> headMap = new HashMap<String, String>();
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Before
    public void before() throws Exception {
        url = "http://101.200.186.153:9999/smartcommunity-api";
        headMap.put("Content-Type", "application/json");
        System.out.println(headMap.toString());
    }
    @Test
    public void login() {
        Map<String, Object> map = new HashMap<>();
        map.put("telephone", "15712955813");
        map.put("password", "123456");
        map.put("userType", "owner");
        String json = JSON.toJSONString(map);
        long costTime = System.currentTimeMillis();
        String response = HttpUtils.post(url + "/auth/login/login", json, headMap);
        costTime = System.currentTimeMillis()-costTime;
        System.out.println(costTime);
        System.out.println(response);
    }

    @Test
    public void redis() {
        Map<String, Object> map = new HashMap<>();
        map.put("telephone", "15712955813");
        map.put("password", "123456");
        map.put("userType", "owner");
        String json = JSON.toJSONString(map);
        long costTime = System.currentTimeMillis();
        String response = HttpUtils.post(url + "/auth/login/login", json, headMap);
        costTime = System.currentTimeMillis()-costTime;
        System.out.println(costTime);
        System.out.println(response);
    }


}
