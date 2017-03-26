package com.gestionCabinetDentaire.www.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.DoubleSummaryStatistics;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
@DiscriminatorValue("medecin")
public class Medecin extends Personne implements Serializable {
	private String username;
	private String password;
	
	
	@OneToMany(mappedBy="medecin", fetch=FetchType.LAZY)
	private Collection<Dossier> dossiers; 
	
	@ManyToOne
	@JoinColumn(name="idSpecialite")
	private Specialite specialite; //new specialité() en cas d'erreur
	
	
	@ManyToOne
	@JoinColumn(name="idCategorie")
	private Categorie categorie; //new categorie() en cas d'erreur
	
	@OneToMany(mappedBy="medecin", fetch=FetchType.LAZY)
	private Collection<Rdv> rdvs;
	
	
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Medecin(String username, String password) {
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


	public Specialite getSpecialite() {
		return specialite;
	}


	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public Collection<Rdv> getRdvs() {
		return rdvs;
	}


	public void setRdvs(Collection<Rdv> rdvs) {
		this.rdvs = rdvs;
	}
}
