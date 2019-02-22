package org.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfiguration {

	@Bean
	@Conditional(TestCondition.class)
	public Hello getHelloWorld(){
		return new Hello();
	}
}
