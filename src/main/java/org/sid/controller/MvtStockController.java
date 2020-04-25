package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.MvtStock;
import org.sid.service.MvtStockService;
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
public class MvtStockController {
	private MvtStockService mvtStockService;
	
	public MvtStockController(MvtStockService mvtStockService) {
		this.mvtStockService = mvtStockService;
	}
	
	@GetMapping(value = "/mvtStocks")
	public List<MvtStock> findAllMvtStock() {
		return mvtStockService.getAllMvtStocks();
	}
	
	@GetMapping(value = "/mvtStocks/{idMvtStock}")
	public Optional<MvtStock> findMvtStockById(@PathVariable Long idMvtStock) {
		return mvtStockService.getMvtStockById(idMvtStock);
	}
	
	@PostMapping(value = "/mvtStocks")
	public MvtStock save(@RequestBody MvtStock mvtStock) {
		return mvtStockService.saveMvtStock(mvtStock);
	}
	
	@PutMapping(value = "/mvtStocks/{idMvtStock}")
	public MvtStock update(@PathVariable Long idMvtStock, @RequestBody MvtStock mvtStock) {
		mvtStock.setIdMvtStock(idMvtStock);
		return mvtStockService.saveMvtStock(mvtStock);
	}
	
	@DeleteMapping(value = "/mvtStocks/{idMvtStock}")
	public void delete(@PathVariable Long idMvtStock) {
		mvtStockService.deleteMvtStock(idMvtStock);
	}

}
