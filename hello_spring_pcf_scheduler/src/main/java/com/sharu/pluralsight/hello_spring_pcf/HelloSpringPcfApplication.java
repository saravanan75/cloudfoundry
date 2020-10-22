package com.sharu.pluralsight.hello_spring_pcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringPcfApplication {
	@GetMapping("/hellops")
	public String helloPCF() {
		return "Hello from pluralsight course";
	}
	public static void main(String[] args) {

		SpringApplication.run(HelloSpringPcfApplication.class, args);
	}

}
