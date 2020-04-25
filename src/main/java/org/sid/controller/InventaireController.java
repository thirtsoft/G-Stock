package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Inventaire;
import org.sid.service.InventaireService;
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
public class InventaireController {
	
	private InventaireService inventaireService;
	
	public InventaireController(InventaireService inventaireService) {
		this.inventaireService = inventaireService;
	}
	
	@GetMapping(value = "/inventaires")
	public List<Inventaire> findAllinventaire() {
		return inventaireService.findAllInventaires();
	}
	
	@GetMapping(value = "/inventaires/{id}")
	public Optional<Inventaire> findinventaireById(@PathVariable(value="id") Long id) {
		return inventaireService.getInventaireById(id);

	}
	
	@PostMapping(value = "/inventaires")
	public Inventaire save(@RequestBody Inventaire inventaire) {
		return inventaireService.saveInventaire(inventaire);
	}
	
	@PutMapping(value = "/inventaires/{id}")
	public Inventaire update(@PathVariable(value = "id") Long id, @RequestBody Inventaire inventaire) {
		inventaire.setIdInventaire(id);
		return inventaireService.saveInventaire(inventaire);
	}
	
	@DeleteMapping(value = "/inventaires/{id}")
	public void delete(@PathVariable (value = "id") Long id) {
		inventaireService.deleteInventaire(id);
	}

}
