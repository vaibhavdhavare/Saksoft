package com.saksoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saksoft.model.Employee;
import com.saksoft.service.EmployeeService;

@RestController
@RequestMapping("/user")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/save")
	public ResponseEntity<Employee> save(@RequestBody Employee employee) {
		Employee emp = employeeService.save(employee);
		return ResponseEntity.ok().body(emp);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Employee> update(@RequestBody Employee employee, @PathVariable("id") int id) {
		Employee updateEmp = employeeService.update(employee, id);
		return ResponseEntity.ok().body(updateEmp);
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable ("id") Integer Id){
		Employee emp=employeeService.getEmployeeById(Id);
		return ResponseEntity.ok().body(emp);
	}
	@GetMapping("/getall")
	public List<Employee> getAllEmployee(@RequestBody Employee employee){
		List<Employee> list=employeeService.getListById(employee);
		return list;
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Employee> deleteById(@RequestBody Employee employee,@PathVariable("id") int id){
		 employeeService.deleteById(id);
		 return null;
	}

}
