package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.CompteEpargne;
import com.inti.service.interfaces.ICompteEpargneService;

@RestController
public class CompteEpargneController {
	@Autowired
	ICompteEpargneService compteEpargneService;
	
	@GetMapping("/comptesEpargne")
	public List<CompteEpargne> findAll(){
		return compteEpargneService.findAll();
	}
	
	@GetMapping("comptesEpargne/{idCompteEpargne}")
	public CompteEpargne findOne(@PathVariable("idCompteEpargne") Long id) {
		return compteEpargneService.findOne(id);
	}
	
	@PostMapping("/comptesEpargne")
	public CompteEpargne saveCompteEpargne(@RequestBody CompteEpargne compteEpargne) {
		return compteEpargneService.save(compteEpargne);
	}
	
	@DeleteMapping("/comptesEpargne/{idCompteEpargne}")
	public void delete(@PathVariable("idCompteEpargne") Long id) {
		compteEpargneService.delete(id);
	}
}