package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Compte implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCompte;
	private Date dateCreation;
	private double solde;
	@ManyToOne
	@JoinColumn(name="id_user")
	private Utilisateur utilisateur;

	public Compte() {

	}

	public Compte(Date dateCreation, double solde) {
		this.dateCreation = dateCreation;
		this.solde = solde;
	}
	
	
	
	public Compte(Date dateCreation, double solde, Utilisateur utilisateur) {
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.utilisateur = utilisateur;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Long getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", dateCreation=" + dateCreation + ", solde=" + solde + "]";
	}
	
	
}
