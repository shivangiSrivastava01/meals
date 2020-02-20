package com.meals.serviceImplementation;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.meals.repository.EmployeeDao;
import com.meals.domain.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired 
	DataSource dataSource;
	
	
	@Override
	public void insertEmployee(Employee emp) {
		String sql = "INSERT INTO employee " +
				"(empId, empName) VALUES (?, ?)" ;
	}
}
