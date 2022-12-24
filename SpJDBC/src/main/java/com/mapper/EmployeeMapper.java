package com.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.modal.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		e.setEmpName(rs.getString(1));
		e.setEmail(rs.getString(2));
		e.setPassword(rs.getString(3));
		e.setRole(rs.getString(4));
		return e;
	}

	
}
