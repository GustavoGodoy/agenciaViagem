package com.fiap.checkpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fiap.checkpoint.controller")
public class CheckpointFiapApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckpointFiapApplication.class, args);
	}

}
