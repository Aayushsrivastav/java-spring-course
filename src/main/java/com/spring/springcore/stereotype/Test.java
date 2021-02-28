package com.spring.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/spring/springcore/stereotype/stereoconfig.xml");
		Student student = context.getBean("student1", Student.class);
		//Getttin object using stereotype annotation
		System.out.println(student);
		
		System.out.println(student.getAddresses());
		System.out.println(student.getAddresses().getClass().getName());
		
		//bean type example using annotation
		System.out.println(student.hashCode());
		Student student2 = context.getBean("student1", Student.class);
		System.out.println(student2.hashCode());
		
		//bean type example using xml configuration
		Teacher teacher1 = context.getBean("teacher", Teacher.class);
		Teacher teacher2 = context.getBean("teacher", Teacher.class);
		
		System.out.println(teacher1.hashCode());
		System.out.println(teacher2.hashCode());
	}

}
