package com.repo;

import java.util.List;

import com.model.Employee;

public interface EmpRepo {
	 void saveEmpRepo(Employee emp);  // abstract method
	 void updateEmpRepo(Employee emp);
	 Employee getEmpRepo(Integer eId);
	 List<Employee> getAllEmpRepo();
}
