package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Role;
import org.sid.service.RoleService;
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
public class RolerController {
	
	private RoleService roleService;
	
	public RolerController(RoleService roleService) {
		this.roleService = roleService;
	}
	
	@GetMapping(value = "/roles")
	public List<Role> findAllrole() {
		return roleService.getAllRoleServices();
	}
	
	@GetMapping(value = "/roles/{id}")
	public Optional<Role> findroleById(@PathVariable(value="id") Long id) {
		return roleService.getRoleById(id);

	}
	
	@PostMapping(value = "/roles")
	public Role save(@RequestBody Role role) {
		return roleService.saveRole(role);
	}
	
	@PutMapping(value = "/roles/{id}")
	public Role update(@PathVariable(value = "id") Long id, @RequestBody Role role) {
		role.setIdRole(id);
		return roleService.saveRole(role);
	}
	
	@DeleteMapping(value = "/roles/{id}")
	public void delete(@PathVariable(value ="id") Long id) {
		roleService.deleteRole(id);
	}

}
