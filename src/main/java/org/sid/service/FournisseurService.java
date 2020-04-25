package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.Fournisseur;
import org.sid.repository.FournisseurRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FournisseurService {
	private FournisseurRepository fournisseurRepository;
	
	public FournisseurService(FournisseurRepository fournisseurRepository) {
		this.fournisseurRepository = fournisseurRepository;
	}
	
	public List<Fournisseur> getAllFournisseurServices() {
		return fournisseurRepository.findAll();
	}
	
	public Optional<Fournisseur> getFournisseurById(Long idFournisseur) {
		return fournisseurRepository.findById(idFournisseur);
	}
	
	public Fournisseur saveFournisseur(Fournisseur fournisseur) {
		return fournisseurRepository.save(fournisseur);
	}
	
	public Fournisseur updateFournisseur(Fournisseur fournisseur) {
		return fournisseurRepository.save(fournisseur);
	}
	
	public void deleteFournisseur(Long idFournisseur) {
		fournisseurRepository.deleteById(idFournisseur);
	}

}
