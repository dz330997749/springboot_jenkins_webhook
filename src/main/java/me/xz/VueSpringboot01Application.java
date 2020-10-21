package me.xz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("me.xz.dao")
@SpringBootApplication()
public class VueSpringboot01Application {

	public static void main(String[] args) {
		SpringApplication.run(VueSpringboot01Application.class, args);
	}

}
