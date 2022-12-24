package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.EmpConfig;
import com.model.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(EmpConfig.class); //LCC
		Employee e = ac.getBean("emp",Employee.class);
		Employee e1 = (Employee) ac.getBean("emp1");
		
		System.out.println(e);
		System.out.println(e1);
	}

}
