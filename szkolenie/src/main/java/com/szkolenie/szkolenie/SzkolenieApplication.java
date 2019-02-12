package com.szkolenie.szkolenie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SzkolenieApplication {

	public static void main(String[] args) {
		SpringApplication.run(SzkolenieApplication.class, args);
	}

}

