package com.gestionCabinetDentaire.www.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Ordonance implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idOrdonance;
	private String titre;
	private Date date;
	private String observation;
	private String traitement;
	
	
	@OneToOne(mappedBy="ordonance")
	private Visite visite;


	public Ordonance() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ordonance(String titre, Date date, String observation, String traitement) {
		super();
		this.titre = titre;
		this.date = date;
		this.observation = observation;
		this.traitement = traitement;
	}


	public Long getIdOrdonance() {
		return idOrdonance;
	}


	public void setIdOrdonance(Long idOrdonance) {
		this.idOrdonance = idOrdonance;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getObservation() {
		return observation;
	}


	public void setObservation(String observation) {
		this.observation = observation;
	}


	public String getTraitement() {
		return traitement;
	}


	public void setTraitement(String traitement) {
		this.traitement = traitement;
	}


	public Visite getVisite() {
		return visite;
	}


	public void setVisite(Visite visite) {
		this.visite = visite;
	}
}
