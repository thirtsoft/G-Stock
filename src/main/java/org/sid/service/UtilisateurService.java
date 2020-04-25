package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.Utilisateur;
import org.sid.repository.UtilisateurRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UtilisateurService {
	
	private UtilisateurRepository utilisateurRepository;
	
	public UtilisateurService(UtilisateurRepository utilisateurRepository) {
		this.utilisateurRepository = utilisateurRepository;
	}
	
	public List<Utilisateur> getAllUtilisateurServices() {
		return utilisateurRepository.findAll();
	}
	
	public Optional<Utilisateur> getUtilisateurById(Long idUtilisateur) {
		return utilisateurRepository.findById(idUtilisateur);
	}
	
	public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}
	
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}
	
	public void deleteUtilisateur(Long idUtilisateur) {
		utilisateurRepository.deleteById(idUtilisateur);
	}


}
