package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import com.gestionCabinetDentaire.www.entities.Paiement;

public interface IPaiementDao {
	public Paiement ajouterpaiement(Paiement p);
	public Paiement modifierpaiement(Paiement p);
	public void supprimerpaiement(Long idPaiement);
	public Paiement findpaiementById(Long idPaiement);
	public List<Paiement> findAllPaiement();
}
