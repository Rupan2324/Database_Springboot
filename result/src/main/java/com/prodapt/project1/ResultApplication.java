package com.prodapt.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"com.prodapt.project2", "com.prodapt.project1" })
public class ResultApplication {

	public static void main(String[] args) {

		SpringApplication.run(ResultApplication.class, args);

	}

}
