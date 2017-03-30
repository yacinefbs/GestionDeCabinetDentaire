package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import com.gestionCabinetDentaire.www.entities.Medecin;

public interface IMedecinDao {
	public Medecin ajouterMedecin(Medecin m);
	public Medecin modifierMedecin(Medecin m);
	public void supprimerMedecin(Long idMedecin);
	public Medecin findMedecinById(Long idMedecin);
	public List<Medecin> findAllMedecin();
}
