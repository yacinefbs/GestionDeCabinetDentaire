package com.gestionCabinetDentaire.www.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Specialite implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSpecialite;
	private String libelle;
	
	@OneToMany(mappedBy="specialite", fetch=FetchType.LAZY)
	private Collection<Medecin> medecins;
	
	
	
	public Specialite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Specialite(String libelle) {
		super();
		this.libelle = libelle;
	}
	public Long getIdSpecialite() {
		return idSpecialite;
	}
	public void setIdSpecialite(Long idSpecialite) {
		this.idSpecialite = idSpecialite;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Collection<Medecin> getMedecins() {
		return medecins;
	}
	public void setMedecins(Collection<Medecin> medecins) {
		this.medecins = medecins;
	}
}
