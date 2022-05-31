package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.CompteCourant;

public interface ICompteCourantService {
	List<CompteCourant> findAll();

	CompteCourant findOne(Long id);

	public CompteCourant save(CompteCourant compteCourant);

	public void delete(Long id);
}
