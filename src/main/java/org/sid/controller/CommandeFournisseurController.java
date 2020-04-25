package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.CommandeFournisseur;
import org.sid.service.CommandeFournisseurService;
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
public class CommandeFournisseurController {
	private CommandeFournisseurService commandeFournisseurService;
	
	public CommandeFournisseurController(CommandeFournisseurService commandeFournisseurService) {
		this.commandeFournisseurService = commandeFournisseurService;
	}
	
	@GetMapping(value = "/commandeFournisseurs")
	public List<CommandeFournisseur> findAllCommandeFournisseurs() {
		return commandeFournisseurService.getAllCommandeFournisseurs();
	}
	
	@GetMapping(value = "/commandeFournisseurs/{id}")
	public Optional<CommandeFournisseur> findCommandeFournisseurById(@PathVariable Long id) {
		return commandeFournisseurService.getCommandeFournisseurById(id);
	}
	
	@PostMapping(value = "/commandeFournisseurs")
	public CommandeFournisseur save(@RequestBody CommandeFournisseur commandeFournisseur) {
		return commandeFournisseurService.saveCommandeFournisseur(commandeFournisseur);
	}
	
	@PutMapping(value = "/commandeFournisseurs/{id}")
	public CommandeFournisseur save(@PathVariable Long id, @RequestBody CommandeFournisseur commandeFournisseur) {
		commandeFournisseur.setIdCmdFournisseur(id);
		return commandeFournisseurService.saveCommandeFournisseur(commandeFournisseur);
	}
	
	@DeleteMapping(value = "/commandeFournisseurs/{id}")
	public void delete(@PathVariable Long id) {
		commandeFournisseurService.deleteCommandeFournisseur(id);
	}

}
