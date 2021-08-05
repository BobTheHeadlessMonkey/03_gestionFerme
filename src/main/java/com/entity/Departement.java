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
public class Departement {

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDepartement;

	private String nom;
	private String region;

	// Association UML
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "assoc_ferme_departement", joinColumns = {
			@JoinColumn(name = "id_departement", referencedColumnName = "idDepartement") }, inverseJoinColumns = {
					@JoinColumn(name = "id_ferme", table = "ferme", referencedColumnName = "idFerme") })
	private List<Ferme> fermes = new ArrayList<Ferme>();

	// Ctors
	public Departement() {
		super();
	}

	public Departement(String nom, String region) {
		super();
		this.nom = nom;
		this.region = region;
	}

	public Departement(Long idDepartement, String nom, String region) {
		super();
		this.idDepartement = idDepartement;
		this.nom = nom;
		this.region = region;
	}

	// Getters-Setters
	public Long getIdDepartement() {
		return idDepartement;
	}

	public void setIdDepartement(Long idDepartement) {
		this.idDepartement = idDepartement;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public List<Ferme> getFermes() {
		return fermes;
	}

	public void setFermes(List<Ferme> fermes) {
		this.fermes = fermes;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "Departement [idDepartement=" + idDepartement + ", nom=" + nom + ", region=" + region + ", fermes="
				+ fermes + "]";
	}

}
