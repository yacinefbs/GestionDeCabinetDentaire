package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import com.gestionCabinetDentaire.www.entities.Dossier;

public interface IDossierMetier {
	public Dossier ajouterDossier(Dossier d);
	public Dossier modifierDossier(Dossier d);
	public void supprimerDossier(Long idDossier);
	public Dossier findDossierById(Long idDossier);
	public List<Dossier> findAllDossier();
}
