package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Boutique;
import org.sid.service.BoutiqueService;
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
public class BoutiqueController {
	
	private BoutiqueService boutiqueService;
	
	public BoutiqueController(BoutiqueService boutiqueService) {
		this.boutiqueService = boutiqueService;
	}
	
	@GetMapping(value = "/Boutiques")
	public List<Boutique> findAllBoutique() {
		return boutiqueService.findAllBoutique();
	}
	
	@GetMapping(value = "/Boutiques/{id}")
	public Optional<Boutique> findBoutiqueById(@PathVariable(value="id") Long id) {
		return boutiqueService.findBoutiqueById(id);

	}
	
	@PostMapping(value = "/Boutiques")
	public Boutique save(@RequestBody Boutique boutique) {
		return boutiqueService.saveBoutique(boutique);
	}
	
	@PutMapping(value = "/Boutiques/{id}")
	public Boutique update(@PathVariable(value="id") Long id, @RequestBody Boutique boutique) {
		boutique.setIdBoutique(id);
		return boutiqueService.saveBoutique(boutique);
	}
	
	@DeleteMapping(value = "/Boutiques/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		boutiqueService.deleteBoutique(id);
	}

}
