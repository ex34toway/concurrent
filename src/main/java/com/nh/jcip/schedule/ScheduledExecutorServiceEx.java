package com.nh.jcip.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceEx {
	public static void scheduleWithFixedDelay() {
		final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

		// 设定执行线程计划,初始10s延迟,每次任务完成后延迟10s再执行一次任务
		final Runnable beeper = new Runnable() {
			@Override
			public void run() {
				SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				long time = (long) (Math.random() * 1000);
				System.out.println(
						sf.format(new Date()) + "线程:" + Thread.currentThread().getName() + ":Sleeping" + time + "ms");
				try {
					Thread.sleep(time);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		final ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(beeper, 10, 10,
				TimeUnit.SECONDS);

		// 40s后取消任务
		scheduledExecutorService.schedule(new Runnable() {
			public void run() {
				scheduledFuture.cancel(true);
				scheduledExecutorService.shutdown();
			}
		}, 40, TimeUnit.SECONDS);
	}

	public static void main(String[] args) {
		scheduleWithFixedDelay();
	}
}
