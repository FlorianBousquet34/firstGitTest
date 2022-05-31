package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Utilisateur;

public interface IUtilisateurService {
	List<Utilisateur> findAll();

	Utilisateur findOne(Long id);

	public Utilisateur save(Utilisateur utilisateur);

	public void delete(Long id);
}

