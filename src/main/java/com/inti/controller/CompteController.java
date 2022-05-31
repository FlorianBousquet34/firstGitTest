package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Compte;
import com.inti.service.interfaces.ICompteService;

@RestController
public class CompteController {
	@Autowired
	ICompteService compteService;
	
	@GetMapping("/comptes")
	public List<Compte> findAll(){
		return compteService.findAll();
	}
	
	@GetMapping("comptes/{idCompte}")
	public Compte findOne(@PathVariable("idCompte") Long id) {
		return compteService.findOne(id);
	}
	
	@PostMapping("/comptes")
	public Compte saveCompte(@RequestBody Compte compte) {
		return compteService.save(compte);
	}
	
	@DeleteMapping("/comptes/{idCompte}")
	public void delete(@PathVariable("idCompte") Long id) {
		compteService.delete(id);
	}
}