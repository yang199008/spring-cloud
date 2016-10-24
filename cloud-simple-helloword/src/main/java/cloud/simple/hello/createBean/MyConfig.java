package cloud.simple.hello.createBean;

import cloud.simple.hello.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2016/10/19.
 */
public class MyConfig {
    /**

     *  这里只是测试使用，没有实际的意义.

     */

    @Bean(name="userService")

    public UserService filterRegistrationBean(@Qualifier("shanhyB") Shanhy shanhy){

        //UserService = new UserService();

        shanhy.dispaly();

        // 其它处理代码.

        return null;

    }
}
