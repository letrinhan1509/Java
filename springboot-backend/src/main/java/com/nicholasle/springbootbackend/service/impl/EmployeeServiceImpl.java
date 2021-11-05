package com.nicholasle.springbootbackend.service.impl;

import org.springframework.stereotype.Service;

import com.nicholasle.springbootbackend.model.Employee;
import com.nicholasle.springbootbackend.repository.EmployeeRepository;
import com.nicholasle.springbootbackend.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
}
