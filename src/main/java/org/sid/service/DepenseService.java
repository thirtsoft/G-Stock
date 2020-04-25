package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.Depense;
import org.sid.repository.DepenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DepenseService {
	@Autowired
	private DepenseRepository depenseRepository;
	
	public List<Depense> findAllDepenses() {
		return depenseRepository.findAll();
	}
	
	public Optional<Depense> findDepenseById(Long id) {
		return depenseRepository.findById(id);
	}
	
	public Depense saveDepense(Depense depense) {
		return depenseRepository.save(depense);
	}
	
	public Depense updateDepense(Depense depense) {
		return depenseRepository.save(depense);
	}
	
	public void deleteDepense(Long id) {
		depenseRepository.deleteById(id);
	}

}
