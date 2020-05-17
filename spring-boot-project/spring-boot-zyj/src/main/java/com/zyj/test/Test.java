package com.zyj.test;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test {
	public static void main(String[] args) {
		SpringApplication.run(Test.class,args);
//		SpringApplication application = new SpringApplication(Test.class);
//		application.setBannerMode(Banner.Mode.OFF);
//		application.run(args);
	}
}
