package com.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.Employee;

@Configuration
public class EmpConfig {

    //no of method = no of obj
	@Bean // obj emp() spring container
	public Employee emp() {
		Employee e = new Employee();
		e.setId(10);
		e.setName("EMP1");
		e.setSal(1000.0f);
		e.setEmpPrjs(eprj());
		return e;
	}
	
	
	public List<String> eprj(){
		List<String> prList = new ArrayList();
		prList.add("PYTHON");
		prList.add("JAVA");
		prList.add("C++");
		return prList;
	}
	
}
