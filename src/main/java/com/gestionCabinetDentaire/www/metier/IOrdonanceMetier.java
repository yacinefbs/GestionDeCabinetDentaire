package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import com.gestionCabinetDentaire.www.entities.Ordonance;

public interface IOrdonanceMetier {
	public Ordonance ajouterOrdonance(Ordonance o);
	public Ordonance modifierOrdonance(Ordonance o);
	public void supprimerOrdonance(Long idOrdonance);
	public Ordonance findOrdonanceById(Long idOrdonance);
	public List<Ordonance> findAllOrdonance();
}
