package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.model.Employee;

@Configuration
@PropertySource("emp.properties")
public class EmpConfig {
	
	@Autowired
	private Environment env; //HAS_A
	
	//no of methods with @Bean == no of Objects
	@Bean
	public Employee emp() {
		Employee e = new Employee();
		e.setEid(Integer.parseInt(env.getProperty("eid")));
		e.setEname(env.getProperty("en"));
		return e;
	}
	
	@Bean
	public Employee emp1() {
		Employee e = new Employee();
		e.setEid(null);
		e.setEname(null);
		return e;
	}

}
