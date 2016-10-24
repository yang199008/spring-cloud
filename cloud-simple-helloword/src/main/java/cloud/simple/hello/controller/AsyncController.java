package cloud.simple.hello.controller;

import cloud.simple.hello.Async.Task2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2016/10/19.
 */
@RestController
public class AsyncController {
    @Autowired
    Task2 task2;
    @RequestMapping("/task2")

    public String task2() throws Exception{

        task2.doTaskOne();

        task2.doTaskTwo();

        task2.doTaskThree();

        return "task2";

    }
}
