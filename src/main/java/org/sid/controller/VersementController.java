package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Versement;
import org.sid.service.VersementService;
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
public class VersementController {
	private VersementService versementService;
	
	public VersementController(VersementService versementService) {
		this.versementService = versementService;
	}
	
	@GetMapping(value = "/versements")
	public List<Versement> findAllVersement() {
		return versementService.getAllVersement();
	}
	
	@GetMapping(value = "/versements/{id}")
	public Optional<Versement> findVersementById(@PathVariable(value="id") Long id) {
		return versementService.getVersementById(id);

	}
	
	@PostMapping(value = "/versements")
	public Versement save(@RequestBody Versement versement) {
		return versementService.saveVersement(versement);
	}
	
	@PutMapping(value = "/versements/{id}")
	public Versement update(@PathVariable(value = "id") Long id, @RequestBody Versement versement) {
		versement.setIdVersement(id);
		return versementService.saveVersement(versement);
	}
	
	@DeleteMapping(value = "/versements/{id}")
	public void delete(@PathVariable(value = "id)=") Long id) {
		versementService.deleteVersementById(id);
	}

}
