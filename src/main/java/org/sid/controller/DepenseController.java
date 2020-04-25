package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Depense;
import org.sid.service.DepenseService;
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
public class DepenseController {
	
	private DepenseService depenseService;
	
	public DepenseController(DepenseService depenseService) {
		this.depenseService = depenseService;
	}
	
	@GetMapping(value = "/Depenses")
	public List<Depense> findAllDepense() {
		return depenseService.findAllDepenses();
	}
	
	@GetMapping(value = "/Depenses/{id}")
	public Optional<Depense> findDepenseById(@PathVariable(value="id") Long id) {
		return depenseService.findDepenseById(id);

	}
	
	@PostMapping(value = "/Depenses")
	public Depense save(@RequestBody Depense depense) {
		return depenseService.saveDepense(depense);
	}
	
	@PutMapping(value = "/Depenses/{id}")
	public Depense update(@PathVariable(value="id") Long id, @RequestBody Depense depense) {
		depense.setIdDepense(id);
		return depenseService.saveDepense(depense);
	}
	
	@DeleteMapping(value = "/Depenses/{id}")
	public void delete(@PathVariable(value="id") Long id) {
		depenseService.deleteDepense(id);
	}

}
