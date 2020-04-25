package org.sid.service;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.Approvisionnement;
import org.sid.repository.ApprovisionnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ApprovisionnementService {
	@Autowired
	private ApprovisionnementRepository approvisionnementRepository;
	
	public List<Approvisionnement> getAllApprovisonnement() {
		return approvisionnementRepository.findAll();	
	}
	
	public Optional<Approvisionnement> getApprovisonnementById(Long id) {
		return approvisionnementRepository.findById(id);
	}
	
	public Approvisionnement saveApprovisionnement(Approvisionnement approvisonnement) {
		return approvisionnementRepository.save(approvisonnement);
	}
	
	public Approvisionnement updateApprovisionnement(Approvisionnement approvisonnement) {
		return approvisionnementRepository.save(approvisonnement);
	}
	
	public void deleteApprovisionnementById(Long id) {
		approvisionnementRepository.deleteById(id);
	}

}
