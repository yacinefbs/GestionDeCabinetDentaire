package com.gestionCabinetDentaire.www.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Dossier implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDossier;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String seance;
	private String remarque;
	
	
	@ManyToOne
	@JoinColumn(name="idPatient", nullable=true)
	private Patient patient; //new patient() en cas d'erreur
	
	
	@ManyToOne
	@JoinColumn(name="idMedecin")
	private Medecin medecin; //new medecin() en cas d'erreur
	
	
	
	public Dossier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dossier(Date date, String seance, String remarque) {
		super();
		this.date = date;
		this.seance = seance;
		this.remarque = remarque;
	}
	public Long getIdDossier() {
		return idDossier;
	}
	public void setIdDossier(Long idDossier) {
		this.idDossier = idDossier;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSeance() {
		return seance;
	}
	public void setSeance(String seance) {
		this.seance = seance;
	}
	public String getRemarque() {
		return remarque;
	}
	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
}
