package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Compte;

public interface ICompteService {
	List<Compte> findAll();

	Compte findOne(Long id);

	public Compte save(Compte compte);

	public void delete(Long id);
}
