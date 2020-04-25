package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Utilisateur;
import org.sid.service.UtilisateurService;
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
public class UtilisateurController {
	private UtilisateurService utilisateurService;
	
	public UtilisateurController(UtilisateurService utilisateurService) {
		this.utilisateurService = utilisateurService;
	}
	
	@GetMapping(value = "/utilisateurs")
	public List<Utilisateur> findAllUtilisateur() {
		return utilisateurService.getAllUtilisateurServices();
	}
	
	@GetMapping(value = "/utilisateurs/{id}")
	public Optional<Utilisateur> findUtilisateurById(@PathVariable(value="id") Long id) {
		return utilisateurService.getUtilisateurById(id);

	}
	
	@PostMapping(value = "/Utilisateurs")
	public Utilisateur save(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.saveUtilisateur(utilisateur);
	}
	
	@PutMapping(value = "/utilisateurs/{id}")
	public Utilisateur update(@PathVariable(value = "id") Long id, @RequestBody Utilisateur utilisateur) {
		utilisateur.setIdUtilisateur(id);
		return utilisateurService.saveUtilisateur(utilisateur);
	}
	
	@DeleteMapping(value = "/Utilisateurs/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		utilisateurService.deleteUtilisateur(id);
	}

}
