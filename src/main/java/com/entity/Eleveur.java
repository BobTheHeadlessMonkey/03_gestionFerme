package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Eleveur {
	private Long idEleveur;
	private String nom;
	private int age;
	private boolean statut;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="assoc_eleveur_animal", joinColumns=@JoinColumn(name="id_eleveur"), inverseJoinColumns=@JoinColumn(name="id_animal"))
	private List<Animal> animals;
	
	public Eleveur() {
		super();
	}
	public Eleveur(String nom, int age, boolean statut) {
		super();
		this.nom = nom;
		this.age = age;
		this.statut = statut;
	}
	public Eleveur(Long idEleveur, String nom, int age, boolean statut) {
		super();
		this.idEleveur = idEleveur;
		this.nom = nom;
		this.age = age;
		this.statut = statut;
	}
	public Long getIdEleveur() {
		return idEleveur;
	}
	public void setIdEleveur(Long idEleveur) {
		this.idEleveur = idEleveur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isStatut() {
		return statut;
	}
	public void setStatut(boolean statut) {
		this.statut = statut;
	}
	public List<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}
	
	
}
