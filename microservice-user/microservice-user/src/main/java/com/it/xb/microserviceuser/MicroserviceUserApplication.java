package com.it.xb.microserviceuser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot启动器
 * 
 * SpringBootApplication 启动器标识
 * RestController controller层
 * mapperScan mybatis扫描dao
 * 
 * 
 * @author Administrator
 * @version 0.0.1
 *
 */
@SpringBootApplication
@RestController
@ComponentScan(basePackages = "com.it.xb.microserviceuser")
@MapperScan(basePackages="com.it.xb.microserviceuser.dao")
public class MicroserviceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceUserApplication.class, args);
	}

	@GetMapping("hello")
	public String hello() {
		return "hello";
	}
}
