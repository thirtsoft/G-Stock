package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.Role;
import org.sid.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleService {
	
	private RoleRepository roleRepository;
	
	public RoleService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}
	
	public List<Role> getAllRoleServices() {
		return roleRepository.findAll();
	}
	
	public Optional<Role> getRoleById(Long idRole) {
		return roleRepository.findById(idRole);
	}
	
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}
	
	public Role updateRole(Role role) {
		return roleRepository.save(role);
	}
	
	public void deleteRole(Long idRole) {
		roleRepository.deleteById(idRole);
	}


}
