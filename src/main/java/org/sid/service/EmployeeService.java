package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.Employee;
import org.sid.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public void DeleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
		
	}

}
