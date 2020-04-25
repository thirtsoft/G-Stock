package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.Vente;
import org.sid.repository.VenteRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class VenteService {
	private VenteRepository venteRepository;
	
	public VenteService(VenteRepository venteRepository) {
		this.venteRepository = venteRepository;
	}
	
	public List<Vente> getAllVente() {
		return venteRepository.findAll();
	}
	
	public Optional<Vente> getVenteById(Long idVente) {
		return venteRepository.findById(idVente);
	}
	
	public Vente saveVente(Vente vente) {
		return venteRepository.save(vente);
	}
	
	public Vente updVente(Vente vente) {
		return venteRepository.save(vente);
	}
	
	public void deleteVenteById(Long idVent) {
		venteRepository.deleteById(idVent);
	}

}
