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
public class Rdv implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idRdv;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Temporal(TemporalType.TIME)
	private Date heure;
	private String motif;
	
	@ManyToOne
	@JoinColumn(name="idMedecin")
	private Medecin medecin;

	@ManyToOne
	@JoinColumn(name="idPatient", nullable=true)
	private Patient patient; //new patient() en cas d'erreur
	
	
	
	public Rdv() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rdv(Date date, Date heure, String motif) {
		super();
		this.date = date;
		this.heure = heure;
		this.motif = motif;
	}
	public Long getIdRdv() {
		return idRdv;
	}
	public void setIdRdv(Long idRdv) {
		this.idRdv = idRdv;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getHeure() {
		return heure;
	}
	public void setHeure(Date heure) {
		this.heure = heure;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}
