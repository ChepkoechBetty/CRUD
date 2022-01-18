package com.springboot.backend.service.impl;

import org.springframework.stereotype.Service;

import com.springboot.backend.exception.ResourceNotFoundException;
import com.springboot.backend.model.Employee;
import com.springboot.backend.repository.EmployeeRepository;
import com.springboot.backend.service.EmployeeService;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee SaveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long Id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(Id).orElseThrow(()->
		new ResourceNotFoundException("Employee","Id",Id));
	}

	@Override
	public Employee updateEmployee(Employee employee, Long Id) {
		// TODO Auto-generated method stub
		Employee existingEmployee=employeeRepository.findById(Id).orElseThrow(()->
		new ResourceNotFoundException("Employee","Id",Id));
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		employeeRepository.save(existingEmployee);
		return existingEmployee;
	}

	@Override
	public void deleteEmployee(Long Id) {
		// TODO Auto-generated method stub
		employeeRepository.findById(Id).orElseThrow(()->
		new ResourceNotFoundException("Employee","Id",Id));
		 employeeRepository.deleteById(Id);
	}

}
