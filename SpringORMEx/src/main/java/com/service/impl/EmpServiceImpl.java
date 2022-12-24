package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repo.EmpRepo;
import com.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired private EmpRepo empRepo;
	
	public void saveEmp(Employee emp) {  // service
		// TODO Auto-generated method stub
		this.empRepo.saveEmp(emp);  // repo will have emp object from service
	}

	public Employee updateEmp(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getEmp(Integer eId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getAllEmp() {
		// TODO Auto-generated method stub
		return null;
	}

}
