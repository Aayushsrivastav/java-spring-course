package com.spring.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springcore/collections/collectionconfig.xml");

		Emp emp = (Emp) context.getBean("emp1");
		System.out.println(emp.getName());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getPhones());
		System.out.println(emp.getCourses());
		System.out.println(emp.getProps());
		System.out.println(emp.getPhones().getClass().getName());
	}

}
