package com.spring.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.spring.springcore.collections.Emp;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springcore/spel/config.xml");

		Demo demo = context.getBean("demo", Demo.class);
		System.out.println(demo);
		
//		SpelExpressionParser temp = new SpelExpressionParser();
//		Expression expression = temp.parseExpression("22+44");
//		System.out.println(expression.getValue());
	}

}
