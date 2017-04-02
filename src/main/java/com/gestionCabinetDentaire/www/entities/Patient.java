package com.gestionCabinetDentaire.www.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("patient")
public class Patient extends Personne implements Serializable {
	private String username;
	private String password;
	
	@OneToMany(mappedBy="patient",orphanRemoval=true, fetch=FetchType.LAZY)
	private Collection<Dossier> dossiers = null;

	@OneToMany(mappedBy="patient", orphanRemoval=true, fetch=FetchType.LAZY)
	private Collection<Rdv> rdvs = null;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Patient(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Dossier> getDossiers() {
		return dossiers;
	}

	public void setDossiers(Collection<Dossier> dossiers) {
		this.dossiers = dossiers;
	}

	public Collection<Rdv> getRdvs() {
		return rdvs;
	}

	public void setRdvs(Collection<Rdv> rdvs) {
		this.rdvs = rdvs;
	}
	
	
	
	
	
	
}
