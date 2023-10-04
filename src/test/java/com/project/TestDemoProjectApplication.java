package com.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoProjectApplication::main).with(TestDemoProjectApplication.class).run(args);
	}

}
