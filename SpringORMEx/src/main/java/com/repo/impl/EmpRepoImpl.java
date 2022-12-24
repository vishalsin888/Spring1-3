package com.repo.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.model.Employee;
import com.repo.EmpRepo;

@Repository
public class EmpRepoImpl implements EmpRepo {

	@Autowired private HibernateTemplate htemp;
	
	@Transactional
	public void saveEmp(Employee emp) {  // insert -- save
		 this.htemp.save(emp);
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
