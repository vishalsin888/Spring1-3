package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Employee;
import com.config.EmpConfig;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(EmpConfig.class);  // new cont.
//		Object emp = ac.getBean("emp); ///object
//		Employee emp1 = (Employee)emp;
		
		Employee e = ac.getBean("emp", Employee.class);
		e.setId(100);
		
		System.out.println(e.toString());
	}

}
