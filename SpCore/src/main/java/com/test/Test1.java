package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.StdConfig;
import com.model.Student;

public class Test1 {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(StdConfig.class);
		Student st = ac.getBean("sobj",Student.class);
		System.out.println(st);
	}
}
