package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.CompteCourant;
import com.inti.repository.CompteCourantRepository;
import com.inti.service.interfaces.ICompteCourantService;

@Service
public class CompteCourantService implements ICompteCourantService{
	@Autowired
	CompteCourantRepository compteCourantRepository;

	@Override
	public List<CompteCourant> findAll() {
		return compteCourantRepository.findAll();
	}

	@Override
	public CompteCourant findOne(Long id) {
		return compteCourantRepository.findById(id).get();
	}

	@Override
	public CompteCourant save(CompteCourant compteCourant) {
		return compteCourantRepository.save(compteCourant);
	}

	@Override
	public void delete(Long id) {
		compteCourantRepository.deleteById(id);
		
	}
}
