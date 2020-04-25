package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.LigneCommandeClient;
import org.sid.repository.LigneCommandeClientRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LigneCommandeClientService {
	private LigneCommandeClientRepository ligneCommandeClientRepository;
	
	public LigneCommandeClientService(LigneCommandeClientRepository ligneCommandeClientRepository) {
		this.ligneCommandeClientRepository = ligneCommandeClientRepository;
	}
	
	public List<LigneCommandeClient> getAllLigneCommandeclient() {
		return ligneCommandeClientRepository.findAll();
		
	}
	
	public Optional<LigneCommandeClient> getLigneCommandeClientById(Long id) {
		return ligneCommandeClientRepository.findById(id);
	}
	
	public LigneCommandeClient saveLigneCommandeClient(LigneCommandeClient ligneCommandeClient) {
		return ligneCommandeClientRepository.save(ligneCommandeClient);
	}
	
	public LigneCommandeClient updateLigneCommandeClient(LigneCommandeClient ligneCommandeClient) {
		return ligneCommandeClientRepository.save(ligneCommandeClient);
	}
	
	public void deleteLigneCommandeClient(Long id) {
		ligneCommandeClientRepository.deleteById(id);
	}
}
