package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.CompteEpargne;

public interface ICompteEpargneService {
	List<CompteEpargne> findAll();

	CompteEpargne findOne(Long id);

	public CompteEpargne save(CompteEpargne compteEpargne);

	public void delete(Long id);
}
