package org.sid.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.sid.entites.MvtStock;
import org.sid.repository.MvtStockRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MvtStockService {
	private MvtStockRepository mvtStockRepository;
	
	public MvtStockService(MvtStockRepository mvtStockRepository) {
		this.mvtStockRepository = mvtStockRepository;
	}
	
	public List<MvtStock> getAllMvtStocks() {
		return mvtStockRepository.findAll();
	}
	
	public Optional<MvtStock> getMvtStockById(Long id) {
		return mvtStockRepository.findById(id);
	}
	
	public MvtStock saveMvtStock(MvtStock mvtStock) {
		return mvtStockRepository.save(mvtStock);
	}
	
	public MvtStock updateMvtStock(MvtStock mvtStock) {
		return mvtStockRepository.save(mvtStock);
	}
	
	public void deleteMvtStock(Long id) {
		mvtStockRepository.deleteById(id);
	}

}
