package com.slokam.Ravinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.slokam.Ravinder.Util.StringUtil;

@SpringBootApplication
@EnableJpaRepositories({"com.slokam.Ravinder.dao"})
@ComponentScan({"com.slokam.Ravinder.controller","com.slokam.Ravinder.service","com.slokam.Ravinder.exception","com.slokam.Ravinder.Util"})
@EntityScan("com.slokam.Ravinder.pojo")

public class RavinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RavinderApplication.class, args);
	}
	@Bean
	public StringUtil stringUtil(){
		return new StringUtil();
	}
}
