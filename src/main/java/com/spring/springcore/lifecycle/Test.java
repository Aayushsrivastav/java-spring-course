package com.spring.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springcore/lifecycle/lifecycleconfig.xml");
		
		//registering shut down hook
				context.registerShutdownHook();
		
//		Samosa samosa = (Samosa) context.getBean("samosa");
//		System.out.println(samosa);
		
//		System.out.println("-------------------------------");
//		
//		Pepsi pepsi = (Pepsi) context.getBean("pepsi");
//		System.out.println(pepsi);
				
		System.out.println("----------------");
		
		Example example = (Example) context.getBean("example");
		System.out.println(example);
	}

}
