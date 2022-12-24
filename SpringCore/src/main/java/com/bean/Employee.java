package com.bean;

import java.util.List;

public class Employee {

	//primitive
	private Integer id;
	private String name;
	private Float sal;
	
	//collection
	private List<String> empPrjs;
	
	private Address add;  //Refere HAS-A

	public List<String> getEmpPrjs() {
		return empPrjs;
	}

	public void setEmpPrjs(List<String> empPrjs) {
		this.empPrjs = empPrjs;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getSal() {
		return sal;
	}

	public void setSal(Float sal) {
		this.sal = sal;
	}

	public Employee() {
		super();
	}

	public Employee(Integer id, String name, Float sal, List<String> empPrjs) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.empPrjs = empPrjs;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", empPrjs=" + empPrjs + "]";
	}
	

}
