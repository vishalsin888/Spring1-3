package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repo.EmpRepo;
import com.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired private EmpRepo empRepo;
	
	public void saveEmp(Employee emp) {  // service
		this.empRepo.saveEmpRepo(emp);  // repo will have emp object from service
	}

	public void updateEmp(Employee emp) {
		this.empRepo.updateEmpRepo(emp);
	}

	public Employee getEmp(Integer eId) {
		// TODO Auto-generated method stub
		return this.empRepo.getEmpRepo(eId);
	}

	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return this.empRepo.getAllEmpRepo();
	}

}
