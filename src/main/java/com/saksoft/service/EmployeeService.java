package com.saksoft.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.saksoft.model.Employee;


public interface EmployeeService {
	public Employee save(Employee employee);
	public Employee update(Employee employee,Integer Id);
	public Employee getEmployeeById(Integer id);
	
	public List<Employee>getListById(Employee employee);
	
	public void  deleteById(Integer id);

}
