package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import com.gestionCabinetDentaire.www.entities.Rdv;

public interface IRdvMetier {
	public Rdv ajouterRdv(Rdv r);
	public Rdv modifierRdv(Rdv r);
	public void supprimerRdv(Long idRdv);
	public Rdv findRdvById(Long idRdv);
	public List<Rdv> findAllRdv();
}
