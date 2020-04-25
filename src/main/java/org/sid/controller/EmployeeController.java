package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Employee;
import org.sid.service.EmployeeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("**")
@RequestMapping("/admin_stock")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping(value = "/employees")
	public List<Employee> findAllEmployee() {
		return employeeService.findAllEmployees();
	}
	
	@GetMapping(value = "/employees/{id}")
	public Optional<Employee> findEmployeeById(@PathVariable(value="id") Long id) {
		return employeeService.getEmployeeById(id);

	}
	
	@PostMapping(value = "/employees")
	public Employee save(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@PutMapping(value = "/employees/{id}")
	public Employee update(@PathVariable (value = "id") Long id, @RequestBody Employee employee) {
		employee.setId(id);
		return employeeService.saveEmployee(employee);
	}
	
	@DeleteMapping(value = "/employees/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		employeeService.DeleteEmployeeById(id);
	}

}
