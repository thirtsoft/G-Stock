package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.CommandeFournisseur;
import org.sid.repository.CommandeFournisseurRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CommandeFournisseurService {
	private CommandeFournisseurRepository commandeFournisseurRepository;
	
	public CommandeFournisseurService(CommandeFournisseurRepository commandeFournisseurRepository) {
		this.commandeFournisseurRepository = commandeFournisseurRepository;
	}
	
	public List<CommandeFournisseur> getAllCommandeFournisseurs() {
		return commandeFournisseurRepository.findAll();
	}
	
	public Optional<CommandeFournisseur> getCommandeFournisseurById(Long idComandeFournisseur) {
		return commandeFournisseurRepository.findById(idComandeFournisseur);
	}
	
	public CommandeFournisseur saveCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		return commandeFournisseurRepository.save(commandeFournisseur);
	}
	
	public CommandeFournisseur updateCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		return commandeFournisseurRepository.save(commandeFournisseur);
	}
	
	public void deleteCommandeFournisseur(Long id) {
		commandeFournisseurRepository.deleteById(id);
	}

}
