package com.gestionCabinetDentaire.www.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Paiement implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPaiement;
	private int nbrSeance;
	private String observation;
	private double montant;
	private String typePaiement;
	
	@ManyToOne
	@JoinColumn(name="idVisite")
	private Visite visite;

	public Paiement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paiement(int nbrSeance, String observation, double montant, String typePaiement) {
		super();
		this.nbrSeance = nbrSeance;
		this.observation = observation;
		this.montant = montant;
		this.typePaiement = typePaiement;
	}

	public Long getIdPaiement() {
		return idPaiement;
	}

	public void setIdPaiement(Long idPaiement) {
		this.idPaiement = idPaiement;
	}

	public int getNbrSeance() {
		return nbrSeance;
	}

	public void setNbrSeance(int nbrSeance) {
		this.nbrSeance = nbrSeance;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getTypePaiement() {
		return typePaiement;
	}

	public void setTypePaiement(String typePaiement) {
		this.typePaiement = typePaiement;
	}

	public Visite getVisite() {
		return visite;
	}

	public void setVisite(Visite visite) {
		this.visite = visite;
	}
}
