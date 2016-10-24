package cloud.simple.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/10/18.
 */
@RestController
public class ExceptionController {
    @RequestMapping("/zeroException")
    public void zeroException() throws Exception {

        throw new Exception("发生错误");

    }
}
