package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.LigneVente;
import org.sid.repository.LigneVenteRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LigneVenteService {
	private LigneVenteRepository ligneVenteRepository;
	
	public LigneVenteService(LigneVenteRepository ligneVenteRepository) {
		this.ligneVenteRepository = ligneVenteRepository;
	}
	
	public List<LigneVente> getAllLigneVentes() {
		return ligneVenteRepository.findAll();
	}
	
	public Optional<LigneVente> getLigneVendeById(Long id) {
		return ligneVenteRepository.findById(id);
	}
	
	public LigneVente saveLigneVente(LigneVente ligneVente) {
		return ligneVenteRepository.save(ligneVente);
	}
	
	public LigneVente updateLigneVente(LigneVente ligneVente) {
		return ligneVenteRepository.save(ligneVente);
	}
	
	public void deleteLigneVente(Long id) {
		ligneVenteRepository.deleteById(id);
	}

}
