package com.example.Jpdemo;

import com.example.Controler.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class JpdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpdemoApplication.class, args);
	}

}
