package com.saksoft.repository;

import java.io.Serializable;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saksoft.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {
	
	public Employee findById(Integer Id);
	
	

}
