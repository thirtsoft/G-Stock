package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Client;
import org.sid.service.ClientService;
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
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	@GetMapping(value = "/clients")
	public List<Client> findAllClients() {
		return clientService.getAllClients();	
	}
	
	@GetMapping(value = "/clients/{id}")
	public Optional<Client> findClientById(@PathVariable Long id) {
		return clientService.getClientById(id);
	}
	
	@PostMapping(value = "/clients")
	public Client saveClient(@RequestBody Client client) {
		return clientService.saveClient(client);
	}
	
	@PutMapping(value = "/clients/{id}")
	public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
		client.setIdClient(id);
		return clientService.saveClient(client);
	}
	
	@DeleteMapping(value = "/clients/{id}")
	public void deleteClient(@PathVariable Long id) {
		clientService.deleteClient(id);
	}

}
