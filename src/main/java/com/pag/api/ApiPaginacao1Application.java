package com.pag.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.pag.api.ClienteMapper")
public class ApiPaginacao1Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiPaginacao1Application.class, args);
	}
	
}
