package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("courant")
public class CompteCourant extends Compte implements Serializable{
	private double decouvert;
	
	public CompteCourant() {
		super();
	}

	public CompteCourant(Date dateCreation, double solde, Utilisateur utilisateur,double decouvert) {
		super(dateCreation, solde, utilisateur);
		this.decouvert = decouvert;
	}
	
	public CompteCourant(Date dateCreation, double solde,double decouvert) {
		super(dateCreation, solde);
		this.decouvert = decouvert;
	}

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return super.toString()+" CompteCourant [decouvert=" + decouvert + "]";
	}
	
}
