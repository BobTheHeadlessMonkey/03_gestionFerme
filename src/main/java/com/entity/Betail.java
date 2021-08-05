package com.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BETAIL")
public class Betail extends Animal {
	private String techElevage;

	public Betail() {
		super();
	}

	public Betail(String techElevage) {
		super();
		this.techElevage = techElevage;
	}
	
	public Betail(boolean etat, String techElevage) {
		super(etat);
		this.techElevage = techElevage;
	}

	public Betail(Long idAnimal, boolean etat, String techElevage) {
		super(idAnimal, etat);
		this.techElevage = techElevage;
	}
	
	

	public String getTechElevage() {
		return techElevage;
	}

	public void setTechElevage(String techElevage) {
		this.techElevage = techElevage;
	}
	
	
}
