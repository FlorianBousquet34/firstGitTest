package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.CompteEpargne;
import com.inti.repository.CompteEpargneRepository;
import com.inti.service.interfaces.ICompteEpargneService;

@Service
public class CompteEpargneService implements ICompteEpargneService{
	@Autowired
	CompteEpargneRepository compteEpargneRepository;

	@Override
	public List<CompteEpargne> findAll() {
		return compteEpargneRepository.findAll();
	}

	@Override
	public CompteEpargne findOne(Long id) {
		return compteEpargneRepository.findById(id).get();
	}

	@Override
	public CompteEpargne save(CompteEpargne compteEpargne) {
		return compteEpargneRepository.save(compteEpargne);
	}

	@Override
	public void delete(Long id) {
		compteEpargneRepository.deleteById(id);
		
	}
}
