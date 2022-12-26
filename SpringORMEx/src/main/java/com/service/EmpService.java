package com.service;

import java.util.List;

import com.model.Employee;

public interface EmpService { 
	 void saveEmp(Employee emp);  // abstract method
	 void updateEmp(Employee emp);
	 Employee getEmp(Integer eId);
	 List<Employee> getAllEmp();
	
}
