package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.Categorie;
import org.sid.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CategorieService {
	@Autowired
	private CategorieRepository categorieRepository;
	
	public List<Categorie> getAllCategorie() {
		return categorieRepository.findAll();
	}
	
	public Optional<Categorie> getCategoryById(Long idCategory){
		return categorieRepository.findById(idCategory);
	}
	
	public Categorie saveCategorie(Categorie categorie) {
		return categorieRepository.save(categorie);
	}
	
	public Categorie updateCategorie(Categorie categorie) {
		return categorieRepository.save(categorie);
	}
	
	public void deleteCategorieById(Long idCategorie) {
		categorieRepository.deleteById(idCategorie);
	}

}
