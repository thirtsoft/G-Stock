package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.LigneCommandeFournisseur;
import org.sid.repository.LigneCommandeFournisseurRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LigneCommandeFournisseurService {
	private LigneCommandeFournisseurRepository ligneCommandeFournisseurRepository;
	
	public LigneCommandeFournisseurService(LigneCommandeFournisseurRepository ligneCommandeFournisseurRepository) {
		this.ligneCommandeFournisseurRepository = ligneCommandeFournisseurRepository;
	}
	
	public List<LigneCommandeFournisseur> getAllLigneCommandeFournisseurServices() {
		return ligneCommandeFournisseurRepository.findAll();
	}
	
	public Optional<LigneCommandeFournisseur> getLigneCommandeFournisseurById(Long id) {
		return ligneCommandeFournisseurRepository.findById(id);
	}
	
	public LigneCommandeFournisseur saveLigneCommandeFournisseur(LigneCommandeFournisseur ligneCommandeFournisseur) {
		return ligneCommandeFournisseurRepository.save(ligneCommandeFournisseur);
	}
	
	public LigneCommandeFournisseur updateLigneCommandeFournisseur(LigneCommandeFournisseur ligneCommandeFournisseur) {
		return ligneCommandeFournisseurRepository.save(ligneCommandeFournisseur);
	}
	
	public void deleteLigneCommandeFournisseur(Long id) {
		ligneCommandeFournisseurRepository.deleteById(id);
	}
	

}
