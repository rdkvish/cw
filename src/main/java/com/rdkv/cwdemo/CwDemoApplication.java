package com.rdkv.cwdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.rdkv.cwdemo"})
@SpringBootApplication
public class CwDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CwDemoApplication.class, args);
	}
}
