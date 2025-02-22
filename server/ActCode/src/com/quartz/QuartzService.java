package com.quartz;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;


/**
 * @author barsk
 * 2014-4-23
 * 调度	
 */
public class QuartzService {

	private static Scheduler scheduler = null;

	public static void start() throws Exception {
		
		SchedulerFactory factory = new StdSchedulerFactory();

		scheduler = factory.getScheduler();

		// 5分钟调度
		JobDetail fiveMinDetail = JobBuilder.newJob(FiveMinQuartz.class).withIdentity("fiveMinDetail", "quartzGroup").build();
		CronTrigger fiveMinTrigger = TriggerBuilder.newTrigger().withIdentity("fiveMinTrigger", "quartzGroup")
				.withSchedule(CronScheduleBuilder.cronSchedule("5 0/5 * * * ?")).build();
		scheduler.scheduleJob(fiveMinDetail, fiveMinTrigger);
		
		// 每日调度
		JobDetail dailyDetail = JobBuilder.newJob(DailyQuartz.class).withIdentity("dailyDetail", "quartzGroup").build();
		CronTrigger dailyTrigger = TriggerBuilder.newTrigger().withIdentity("dailyTrigger", "quartzGroup")
				.withSchedule(CronScheduleBuilder.cronSchedule("40 10 3 * * ?")).build();
		scheduler.scheduleJob(dailyDetail, dailyTrigger);

		scheduler.start();
	}
}
