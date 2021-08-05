package com.entity;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="typeAnimal")
public class Animal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAnimal;
	private boolean etat;
	
	@ManyToMany(mappedBy="animals")
	private List<Eleveur> eleveurs;
	
	@ManyToMany(mappedBy="animals")
	private List<Ferme> fermes;
	
	public Animal() {
		super();
	}
	public Animal(Long idAnimal, boolean etat) {
		super();
		this.idAnimal = idAnimal;
		this.etat = etat;
	}
	
	public Animal(boolean etat) {
		super();
		this.etat = etat;
	}
	public Long getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	public List<Eleveur> getEleveurs() {
		return eleveurs;
	}
	public void setEleveurs(List<Eleveur> eleveurs) {
		this.eleveurs = eleveurs;
	}
	public List<Ferme> getFermes() {
		return fermes;
	}
	public void setFermes(List<Ferme> fermes) {
		this.fermes = fermes;
	}
	
	
}
