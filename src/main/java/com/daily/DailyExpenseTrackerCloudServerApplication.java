package com.daily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DailyExpenseTrackerCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyExpenseTrackerCloudServerApplication.class, args);
		System.out.println("Started cloud Sucessfully");
	}
}
