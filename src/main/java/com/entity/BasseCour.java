package com.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("BASSE_COUR")
public class BasseCour extends Animal {
	private String habitat;

	public BasseCour() {
		super();
	}

	public BasseCour(String habitat) {
		super();
		this.habitat = habitat;
	}
	
	public BasseCour(Long idAnimal, boolean etat, String habitat) {
		super(idAnimal, etat);
		this.habitat = habitat;
	}

	public BasseCour(boolean etat, String habitat) {
		super(etat);
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
}
