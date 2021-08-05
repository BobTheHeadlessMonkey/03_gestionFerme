package com.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Gerant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGerant;

	private String nom;
	private String prenom;

	// Associtaion UML
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "gérants des fermes", joinColumns = {
			@JoinColumn(name = "id_gerant", referencedColumnName = "idGerant") }, inverseJoinColumns = {
					@JoinColumn(name = "id_ferme", table = "ferme", referencedColumnName = "idFerme") })
	private List<Ferme> fermes = new ArrayList<Ferme>();

	// Ctors
	public Gerant() {
		super();
	}

	public Gerant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Gerant(Long idGerant, String nom, String prenom) {
		super();
		this.idGerant = idGerant;
		this.nom = nom;
		this.prenom = prenom;
	}

	// Getters-Setters
	public Long getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(Long idGerant) {
		this.idGerant = idGerant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<Ferme> getFermes() {
		return fermes;
	}

	public void setFermes(List<Ferme> fermes) {
		this.fermes = fermes;
	}

	// ToString
	@Override
	public String toString() {
		return "Gerant [idGerant=" + idGerant + ", nom=" + nom + ", prenom=" + prenom + ", fermes=" + fermes + "]";
	}

}// end class
