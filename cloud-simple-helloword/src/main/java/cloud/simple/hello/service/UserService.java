package cloud.simple.hello.service;

import cloud.simple.hello.Mybatis.mapper.UserMapper;
import cloud.simple.hello.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/18.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMappper;

    public List<User> likeName(){
        return userMappper.findAll();
    }
}
