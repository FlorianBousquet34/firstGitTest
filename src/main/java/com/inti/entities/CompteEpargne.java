package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("epargne")
public class CompteEpargne extends Compte implements Serializable{
	private double taux;

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(Date dateCreation, double solde, Utilisateur utilisateur,double taux) {
		super(dateCreation, solde, utilisateur);
		this.taux = taux;
	}
	
	public CompteEpargne(Date dateCreation, double solde, double taux) {
		super(dateCreation, solde);
		this.taux = taux;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return super.toString()+" CompteEpargne [taux=" + taux + "]";
	}
	
	
	
	
}
