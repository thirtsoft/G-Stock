package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.CommandeClient;
import org.sid.repository.CommandeClientRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CommandeClientService {
	private CommandeClientRepository commandeClientRepository;
	
	public CommandeClientService(CommandeClientRepository commandeClientRepository) {
		this.commandeClientRepository = commandeClientRepository;
	}
	
	public List<CommandeClient> getAllCommandeClient() {
		return commandeClientRepository.findAll();
	}
	
	public Optional<CommandeClient> getCommandeClientById(Long id) {
		return commandeClientRepository.findById(id);
	}
	
	public CommandeClient saveCommandeClient(CommandeClient commandeClient) {
		return commandeClientRepository.save(commandeClient);
	}
	
	public CommandeClient updateCommandeClient(CommandeClient commandeClient) {
		return commandeClientRepository.save(commandeClient);
	}
	
	public void deleteCommandeClient(Long idCommandeClient) {
		commandeClientRepository.deleteById(idCommandeClient);
	}

}
