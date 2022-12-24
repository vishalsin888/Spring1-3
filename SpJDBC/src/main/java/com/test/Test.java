package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.config.DbConfig;
import com.mapper.EmployeeMapper;
import com.modal.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(DbConfig.class);
		JdbcTemplate jtemplate = ac.getBean("jtemp", JdbcTemplate.class);
//		saveUser(jtemplate);
//		updateUser(jtemplate);
//		deleteUser(jtemplate);
		getAllUsers(jtemplate);
	}
	
	private static void getAllUsers(JdbcTemplate jtemplate) {
		String qry = "select * from users";
		List<Employee> emps = jtemplate.query(qry, new EmployeeMapper());
		for(Employee e : emps) {
			System.out.println(e);			
		}
	}

	public static void saveUser(JdbcTemplate temp) {
		String qry = "insert into users values(?,?,?,?)";
		int count = temp.update(qry, "test","xyz@abc.com","111","ADMIN");
		System.out.println(count);
		
	}
	public static void updateUser(JdbcTemplate temp) {
		String qry = "update users set empname = ? where role = ?";
		int count = temp.update(qry, "ABCD","ADMIN");
		System.out.println(count);
		
	}
	public static void deleteUser(JdbcTemplate temp) {
		String qry = "delete from users where role = ? ";
		int count = temp.update(qry , "ADMIN");
		System.out.println(count);
		
	}
}

