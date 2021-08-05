package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ferme {

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFerme;

	private String nom;
	private Date dateAchat;

	// CTors
	public Ferme() {
		super();
	}

	public Ferme(String nom, Date dateAchat) {
		super();
		this.nom = nom;
		this.dateAchat = dateAchat;
	}

	public Ferme(Long idFerme, String nom, Date dateAchat) {
		super();
		this.idFerme = idFerme;
		this.nom = nom;
		this.dateAchat = dateAchat;
	}

	// Getters-Setters
	public Long getIdFerme() {
		return idFerme;
	}

	public void setIdFerme(Long idFerme) {
		this.idFerme = idFerme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}

	// To String
	@Override
	public String toString() {
		return "Ferme [idFerme=" + idFerme + ", nom=" + nom + ", dateAchat=" + dateAchat + "]";
	}

}
