package org.sid.service;


import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.sid.entites.Stock;
import org.sid.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StockService {
	@Autowired
	private StockRepository stockRepository;
	
	public List<Stock> getAllStock() {
		return stockRepository.findAll();	
	}
	
	public Optional<Stock> getStockById(Long id) {
		return stockRepository.findById(id);
	}
	
	public Stock saveStock(Stock stock) {
		return stockRepository.save(stock);
	}
	
	public Stock updateStock(Stock stock) {
		return stockRepository.save(stock);
	}
	
	public void deleteStockById(Long id) {
		stockRepository.deleteById(id);
	}

}
