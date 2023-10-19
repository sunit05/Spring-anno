package com.jsp.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

		Person person = (Person) applicationContext.getBean("person");
		person.printEmpDetails();
	}
}
