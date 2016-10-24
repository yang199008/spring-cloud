package cloud.simple.hello.controller;

import cloud.simple.hello.Vo.SpringUtil;
import cloud.simple.hello.common.MessageInfo;
import cloud.simple.hello.model.User;
import cloud.simple.hello.properties.BaseSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/10/18.
 */
@RestController
@RequestMapping("/json")
public class JsonController {
    @Autowired
    BaseSettings base;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource(name="redisTemplate")
    ValueOperations<Object,Object> valOps;

    @RequestMapping("/")
    public String hello() {
        SpringUtil dd = SpringUtil.getApplicationContext().getBean(SpringUtil.class);
        System.out.println(dd);
        return "Hello world!";

    }

    /**
     * 返回demo数据:
     * <p>
     * 请求地址：http://127.0.0.1:8080/demo/getDemo
     *
     * @return
     */

    @RequestMapping("/getUser")

    public MessageInfo getUser() {

        User user = new User();

        user.setUserId(1111111111111l);

        user.setUserName("yangyang");
        String url = base.getImageUrl();
        System.out.println(url);
        stringRedisTemplate.opsForValue().set("aaa", "111");
       String ss= stringRedisTemplate.opsForValue().get("aaa");
        System.out.println(ss);
        valOps.set("yangyang",user);
         User users=(User) valOps.get("yangyang");
        System.out.println(users.getUserName());

        return new MessageInfo(user);

    }

}
