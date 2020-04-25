package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Stock;
import org.sid.service.StockService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("**")
@RequestMapping("/admin_stock")
public class StockController {
	private StockService stockService;
	
	public StockController(StockService stockService) {
		this.stockService = stockService;
	}
	
	@GetMapping(value = "/stocks")
	public List<Stock> findAllStock() {
		return stockService.getAllStock();
	}
	
	@GetMapping(value = "/stocks/{id}")
	public Optional<Stock> findStockById(@PathVariable(value="id") Long id) {
		return stockService.getStockById(id);

	}
	
	@PostMapping(value = "/stocks")
	public Stock save(@RequestBody Stock Stock) {
		return stockService.saveStock(Stock);
	}
	
	@PutMapping(value = "/stocks/{id}")
	public Stock update(@PathVariable(value = "id") Long id, @RequestBody Stock stock) {
		stock.setIdStock(id);
		return stockService.saveStock(stock);
	}
	
	@DeleteMapping(value = "/stocks/{id}")
	public void delete(@PathVariable(value = "id") Long id) {
		stockService.deleteStockById(id);
	}

}
