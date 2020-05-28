package com.insoft.registro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RegistroApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroApplication.class, args);
	}

}
