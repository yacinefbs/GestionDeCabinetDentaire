package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import com.gestionCabinetDentaire.www.entities.Secretaire;

public interface ISecretaireDao {
	public Secretaire ajouterSecretaire(Secretaire s);
	public Secretaire modifierSecretaire(Secretaire s);
	public void supprimerSecretaire(Long idSecretaire);
	public Secretaire findSecretaireById(Long idSecretaire);
	public List<Secretaire> findAllSecretaire();
}
