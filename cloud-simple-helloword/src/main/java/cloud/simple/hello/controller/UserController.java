package cloud.simple.hello.controller;

import cloud.simple.hello.Vo.SpringUtil;
import cloud.simple.hello.common.MessageInfo;
import cloud.simple.hello.model.User;
import cloud.simple.hello.properties.BaseSettings;
import cloud.simple.hello.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/10/18.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private Logger logger =  LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    @RequestMapping("/likeName")
    public List<User> likeName(String name){
        List <User> userList= userService.likeName();
        return  userList;
    }
}
