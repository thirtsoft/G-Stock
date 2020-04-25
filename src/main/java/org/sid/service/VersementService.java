package org.sid.service;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.sid.entites.Versement;
import org.sid.repository.VersementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class VersementService {
	@Autowired
	private VersementRepository versementRepository;
	
	public List<Versement> getAllVersement() {
		return versementRepository.findAll();	
	}
	
	public Optional<Versement> getVersementById(Long id) {
		return versementRepository.findById(id);
	}
	
	public Versement saveVersement(Versement versement) {
		return versementRepository.save(versement);
	}
	
	public Versement updateVersement(Versement versement) {
		return versementRepository.save(versement);
	}
	
	public void deleteVersementById(Long id) {
		versementRepository.deleteById(id);
	}

}
