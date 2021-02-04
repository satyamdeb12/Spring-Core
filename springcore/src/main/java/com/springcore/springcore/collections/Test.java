package com.springcore.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/springcore/springcore/collections/CollectionsConfig.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getDailyTask());
	}

}
