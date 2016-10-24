package cloud.simple.hello.controller;

import cloud.simple.hello.common.MessageInfo;
import cloud.simple.hello.model.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2016/10/18.
 */
@Controller
@RequestMapping("/jdbc")
public class JdbcController {
    @Resource
    private JdbcTemplate jdbcTemplate;


    /**
     * 返回demo数据:
     * <p>
     * 请求地址：http://127.0.0.1:8080/demo/getDemo
     *
     * @return
     */

    @RequestMapping("/getUserList")

    public MessageInfo getUserList() {


        List<User> users = jdbcTemplate.query("SELECT u.user_name as userName, u.user_id as userId,u.nick_name as nickName   FROM bd_user u ",  new UserRowMapper());
        return  new MessageInfo(users) ;

    }

    @RequestMapping("/getUser")

    public MessageInfo getUser() {
        String sql = "SELECT u.user_name as userName, u.user_id as userId,u.nick_name as nickName from bd_user u where u.user_id=325879485888888";

        RowMapper<User> rowMapper = new BeanPropertyRowMapper <User> (User.class);

        User user= jdbcTemplate.queryForObject(sql, rowMapper);
        return new MessageInfo(user);
    }



    private class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User users = new User();
            users.setUserName(rs.getString("userName"));
            users.setUserId(rs.getLong("userId"));
            users.setNickName(rs.getString("nickName"));
            return users;
        }
    }

}
