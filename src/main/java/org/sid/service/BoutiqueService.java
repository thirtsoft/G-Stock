package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.Boutique;
import org.sid.repository.BoutiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BoutiqueService {
	
	@Autowired
	private BoutiqueRepository boutiqueRepository;
	
	public List<Boutique> findAllBoutique() {
		return boutiqueRepository.findAll();
	}
	
	public Optional<Boutique> findBoutiqueById(Long id) {
		return boutiqueRepository.findById(id);
	}
	
	public Boutique saveBoutique(Boutique boutique) {
		return boutiqueRepository.save(boutique);
	}
	
	public Boutique updateBoutique(Boutique boutique) {
		return boutiqueRepository.save(boutique);
	}
	
	public void deleteBoutique(Long id) {
		boutiqueRepository.deleteById(id);
	}

}
