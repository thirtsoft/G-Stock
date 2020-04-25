package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Approvisionnement;
import org.sid.service.ApprovisionnementService;
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
public class ApprovisionnementController {
	private ApprovisionnementService approvisionnementService;
	
	public ApprovisionnementController(ApprovisionnementService approvisionnementService) {
		this.approvisionnementService = approvisionnementService;
	}
	
	@GetMapping(value = "/approvisionnements")
	public List<Approvisionnement> findAllApprovisionnement() {
		return approvisionnementService.getAllApprovisonnement();
	}
	
	@GetMapping(value = "/approvisionnements/{id}")
	public Optional<Approvisionnement> findApprovisionnementById(@PathVariable(value="id") Long id) {
		return approvisionnementService.getApprovisonnementById(id);

	}
	
	@PostMapping(value = "/approvisionnements")
	public Approvisionnement save(@RequestBody Approvisionnement approvisionnement) {
		return approvisionnementService.saveApprovisionnement(approvisionnement);
	}
	
	@PutMapping(value = "/approvisionnements/{id}")
	public Approvisionnement update(@PathVariable(value = "id") Long id, @RequestBody Approvisionnement approvisionnement) {
		approvisionnement.setIdApprovisionnement(id);
		return approvisionnementService.saveApprovisionnement(approvisionnement);
	}
	
	@DeleteMapping(value = "/approvisionnements/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		approvisionnementService.deleteApprovisionnementById(id);
	}

}
