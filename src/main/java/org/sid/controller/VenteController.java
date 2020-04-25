package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Vente;
import org.sid.service.VenteService;
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
public class VenteController {
	private VenteService venteService;
	
	public VenteController(VenteService venteService) {
		this.venteService = venteService;
	}
	
	@GetMapping(value = "/ventes")
	public List<Vente> findAllVente() {
		return venteService.getAllVente();
	}
	
	@GetMapping(value = "/ventes/{idVente}")
	public Optional<Vente> findVenteById(@PathVariable Long idVente) {
		return venteService.getVenteById(idVente);
	}
	
	@PostMapping(value = "/ventes")
	public Vente save(@RequestBody Vente vente) {
		return venteService.saveVente(vente);
	}
	
	@PutMapping(value = "/ventes/{idVente}")
	public Vente update(@PathVariable Long idVente, @RequestBody Vente vente) {
		vente.setIdVente(idVente);
		return venteService.saveVente(vente);
	}
	
	@DeleteMapping(value = "/ventes/{idVente}")
	public void delete(Long idVente) {
		venteService.deleteVenteById(idVente);
	}

}
