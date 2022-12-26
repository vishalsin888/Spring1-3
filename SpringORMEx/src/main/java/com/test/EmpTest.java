package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;
import com.model.Employee;
import com.service.EmpService;

public class EmpTest {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpService empServiceObj = ac.getBean("empServiceImpl", EmpService.class);
		//Employee e = new Employee(2,"GHIJ",2000);  // error if id does not exists
		//empObj.saveEmp(e);  // service
		System.out.println(empServiceObj.getEmp(1));
//		List<Employee> empList = empServiceObj.getAllEmp();
//		for(Employee ep :empList) {
//			System.out.println(ep);
//		}
//		empServiceObj.updateEmp(e);
	}

}
