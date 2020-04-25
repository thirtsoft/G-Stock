package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Categorie;
import org.sid.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class CategorieController {
	@Autowired
	private CategorieService categorieService;
	
	public CategorieController(CategorieService categorieService) {
		this.categorieService = categorieService;
	}
	
	@GetMapping(value = "/categories")
	public List<Categorie> findAllCategorie() {
		return categorieService.getAllCategorie();
		
	}
	
	@GetMapping(value = "/categories/{idCat}")
	public Optional<Categorie> findCategorieById(@PathVariable Long idCat) {
		return categorieService.getCategoryById(idCat);
	}
	
	@PostMapping(value = "/categories")
	public Categorie save(@RequestBody Categorie categorie) {
		return categorieService.saveCategorie(categorie);
	}
	
	@PutMapping(value = "/categories/{idCat}")
	public Categorie update(@PathVariable Long idCat, @RequestBody Categorie categorie) {
		categorie.setIdCategorie(idCat);
		return categorieService.saveCategorie(categorie);
	}
	
	@DeleteMapping(value = "/categories/{idCat}")
	public void delete(@PathVariable Long idCat) {
		categorieService.deleteCategorieById(idCat);
	}

}
