package com.we.estimate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.we.estimate.Mapper")
public class EstimateApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstimateApplication.class, args);
	}

}
