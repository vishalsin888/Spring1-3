package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.Employee;
import com.service.EmpService;

public class EmpTest {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService empObj = ac.getBean("empServiceImpl", EmpService.class);
		Employee e = new Employee(1,"ABCD",1000);
		empObj.saveEmp(e);  // service
		
	}

}
