package com.spring.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.spring.springcore.javaconfig")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name= {"student","temp","con"})
	public Student getStudent() {
		
		//Creating student object
		Student student = new Student(getSamosa());
		return student;
	}
	
}
