package com.fruit.controller.quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试，忽略这个
 * @author ZhuWenFeng
 */
@Controller
public class QuartzController {

    @RequestMapping("startQuartz.do")
    @ResponseBody
    public void startQuartz() {
        // 开启定时任务，定时清空缓存
        try {
            // 1、创建执行器（调度器，所有的调度都是由它控制）
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            // 2、创建触发器
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1").
                    withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build(); // 0/5 * * * * ? 每隔5秒执行
            // 3、创建定时的执行的内容
            JobDetail detail = JobBuilder.newJob().build();
            // 4、设置定时任务
            scheduler.scheduleJob(detail, trigger);
            // 5、执行
            scheduler.start();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
