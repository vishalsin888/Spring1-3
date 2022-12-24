package com.repo;

import com.model.Employee;

public interface EmpRepo {
	 void saveEmp(Employee emp);  // abstract method
	 Employee updateEmp(Employee emp);
	 Employee getEmp(Integer eId);
	 Employee getAllEmp();
}
