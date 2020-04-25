package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.CommandeClient;
import org.sid.service.CommandeClientService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("**")
@RequestMapping("/admin_stock")
public class CommandeClientController {
	private CommandeClientService commandeClientService;
	
	public CommandeClientController( CommandeClientService commandeClientService) {
		this.commandeClientService = commandeClientService;
	}
	
	@GetMapping(value = "/commandeClients")
	public List<CommandeClient> findAllCommandeClients() {
		return commandeClientService.getAllCommandeClient();
	}
	
	@GetMapping(value = "/commandeClients/{id}")
	public Optional<CommandeClient> findCommandeClientById(@PathVariable Long id) {
		return commandeClientService.getCommandeClientById(id);
	}
	
	@PostMapping(value = "/commandeClients")
	public CommandeClient save(@RequestBody CommandeClient commandeClient) {
		return commandeClientService.saveCommandeClient(commandeClient);
	}
	
	@PostMapping(value = "/commandeClients/{id}")
	public CommandeClient update(@PathVariable Long id, @RequestBody CommandeClient commandeClient) {
		commandeClient.setIdCmdClient(id);
		return commandeClientService.saveCommandeClient(commandeClient);
	}
	
	@DeleteMapping(value = "/commandeClients/{id}")
	public void delete(@PathVariable Long id) {
		commandeClientService.deleteCommandeClient(id);
	}
	
}
