package com.saksoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saksoft.model.Employee;
import com.saksoft.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee employee) {

		return employeeRepository.save(employee);
	}

	@Override
	public Employee update(Employee employee, Integer id) {
		employee.setId(id);
		return employeeRepository.save(employee);
	}


	@Override
	public Employee getEmployeeById(Integer id) {
		Employee employee=employeeRepository.findById(id);
		return employee;
	}

	@Override
	public List<Employee> getListById(Employee employee) {
		return employeeRepository.findAll();
		
	}

	@Override
	public void deleteById(Integer id) {
		 employeeRepository.deleteById(id);
		
	}

}
