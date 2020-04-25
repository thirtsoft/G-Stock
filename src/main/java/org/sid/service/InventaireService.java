package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.Inventaire;
import org.sid.repository.InventaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class InventaireService {
	@Autowired
	private InventaireRepository inventaireRepository;
	
	public List<Inventaire> findAllInventaires() {
		return inventaireRepository.findAll();
	}
	
	public Optional<Inventaire> getInventaireById(Long id) {
		return inventaireRepository.findById(id);
	}
	
	public Inventaire saveInventaire(Inventaire inventaire) {
		return inventaireRepository.save(inventaire);
	}
	
	public Inventaire updateInventaire(Inventaire inventaire) {
		return inventaireRepository.save(inventaire);
	}
	
	public void deleteInventaire(Long id) {
		inventaireRepository.deleteById(id);
	}

}
