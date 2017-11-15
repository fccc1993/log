package com.log.log4j;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

public class Log4jDemo {
	private final static Logger logger = Logger.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			public void run() {
				logger.debug("DEBUG级别");
				logger.info("INFO级别");
				System.out.println("----------------------------" + System.currentTimeMillis());
				logger.error("ERROE级别");
				logger.warn("WARN级别");
			}
		};
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		// 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间
		service.scheduleAtFixedRate(runnable, 5, 2, TimeUnit.SECONDS);

	}
}
