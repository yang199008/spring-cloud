package cloud.simple.hello.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by Administrator on 2016/10/18.
 */
/*@Configuration

@EnableScheduling*/
public class ScheduleController {





        @Scheduled(cron = "0/1 * * * * ?") // 每20秒执行一次

        public void scheduler() {

            System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");

        }

}

