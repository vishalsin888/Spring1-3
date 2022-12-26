package com.repo.impl;


import java.util.List;

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
	public void saveEmpRepo(Employee emp) {  // insert -- save
		 this.htemp.save(emp);
	}

	@Transactional
	public void updateEmpRepo(Employee emp) {
		this.htemp.update(emp);  //id extract update tablename set hff where id = emp.id
	}

	public Employee getEmpRepo(Integer eId) {
		// TODO Auto-generated method stub
		return this.htemp.get(Employee.class, eId);
	}

	public List<Employee> getAllEmpRepo() {
		// TODO Auto-generated method stub
		return this.htemp.loadAll(Employee.class);
	}

}
