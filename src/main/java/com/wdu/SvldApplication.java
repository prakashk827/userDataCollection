package com.wdu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SvldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvldApplication.class, args);
	}

}
