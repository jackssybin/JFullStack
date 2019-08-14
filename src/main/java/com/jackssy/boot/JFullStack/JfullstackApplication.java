package com.jackssy.boot.JFullStack;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jackssy.boot.JFullStack.web.*.mapper")
public class JfullstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(JfullstackApplication.class, args);
	}

}
