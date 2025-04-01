package com.geogodoy.aumigo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AumigoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AumigoApplication.class, args);
	}

}
