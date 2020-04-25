package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Fournisseur;
import org.sid.service.FournisseurService;
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
public class FournisseurController {
	private FournisseurService fournisseurService;
	
	public FournisseurController(FournisseurService fournisseurService) {
		this.fournisseurService = fournisseurService;
	}
	
	@GetMapping(value = "/fournisseurs")
	public List<Fournisseur> findAllFournisseurs() {
		return fournisseurService.getAllFournisseurServices();
	}
	
	@GetMapping(value = "/fournisseurs/{idFournisseur}")
	public Optional<Fournisseur> findFournisseurById(@PathVariable Long idFournisseur) {
		return fournisseurService.getFournisseurById(idFournisseur);
		
	}
	
	@PostMapping(value = "/fournisseurs")
	public Fournisseur saveFournisseur(@RequestBody Fournisseur fournisseur) {
		return fournisseurService.saveFournisseur(fournisseur);
		
	}
	
	@PutMapping(value = "/fournisseurs/{idFournisseru}")
	public Fournisseur update(@PathVariable Long idFournisseur, @RequestBody Fournisseur fournisseur) {
		fournisseur.setIdFournisseur(idFournisseur);
		return fournisseurService.saveFournisseur(fournisseur);
	}
	
	@DeleteMapping(value = "/fournisseurs/{idFournisseur}")
	public void deleteFournisseur(@PathVariable Long idFournisseur) {
		fournisseurService.deleteFournisseur(idFournisseur);
	}

}
