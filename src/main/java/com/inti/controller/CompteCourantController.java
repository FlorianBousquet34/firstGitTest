package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.CompteCourant;
import com.inti.service.interfaces.ICompteCourantService;

@RestController
public class CompteCourantController {
	@Autowired
	ICompteCourantService compteCourantService;
	
	@GetMapping("/comptesCourants")
	public List<CompteCourant> findAll(){
		return compteCourantService.findAll();
	}
	
	@GetMapping("comptesCourants/{idCompteCourant}")
	public CompteCourant findOne(@PathVariable("idCompteCourant") Long id) {
		return compteCourantService.findOne(id);
	}
	
	@PostMapping("/comptesCourants")
	public CompteCourant saveCompteCourant(@RequestBody CompteCourant compteCourant) {
		return compteCourantService.save(compteCourant);
	}
	
	@DeleteMapping("/comptesCourants/{idCompteCourant}")
	public void delete(@PathVariable("idCompteCourant") Long id) {
		compteCourantService.delete(id);
	}
}