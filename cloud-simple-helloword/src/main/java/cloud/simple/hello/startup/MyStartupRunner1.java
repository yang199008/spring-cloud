package cloud.simple.hello.startup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/10/18.
 */
@Component
@Order(value=1)
public class MyStartupRunner1 implements CommandLineRunner {
    @Override

    public void run(String...args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作 11111111<<<<<<<<<<<<<");
    }

}
