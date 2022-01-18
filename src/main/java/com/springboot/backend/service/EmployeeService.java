package com.springboot.backend.service;

import java.util.List;

import com.springboot.backend.model.Employee;

public interface EmployeeService {
	Employee SaveEmployee(Employee employee);
    List<Employee>getAllEmployees();
    Employee getEmployeeById(Long Id);
    Employee updateEmployee(Employee employee,Long Id);
    void deleteEmployee(Long Id);
}
