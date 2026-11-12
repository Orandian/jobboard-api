package com.yan.jobboard_api;

import org.springframework.boot.SpringApplication;

public class TestJobboardApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(JobboardApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
