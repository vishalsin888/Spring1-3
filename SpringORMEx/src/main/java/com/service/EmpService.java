package com.service;

import com.model.Employee;

public interface EmpService { 
	 void saveEmp(Employee emp);  // abstract method
	 Employee updateEmp(Employee emp);
	 Employee getEmp(Integer eId);
	 Employee getAllEmp();
	
}
