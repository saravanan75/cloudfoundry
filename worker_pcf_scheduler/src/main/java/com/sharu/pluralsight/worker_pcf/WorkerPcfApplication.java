package com.sharu.pluralsight.worker_pcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class WorkerPcfApplication {
	@Scheduled(cron = "${cron_schedule}")
	public void scheduledHello(){
		System.out.println("Hello from Pluralsight Course" );
	}
	public static void main(String[] args) {

		SpringApplication.run(WorkerPcfApplication.class, args);
	}

}
