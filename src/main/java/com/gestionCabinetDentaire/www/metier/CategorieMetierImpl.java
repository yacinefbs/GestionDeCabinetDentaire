package com.gestionCabinetDentaire.www.metier;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.dao.CategorieDaoImpl;
import com.gestionCabinetDentaire.www.dao.ICategorieDao;
import com.gestionCabinetDentaire.www.entities.Categorie;


@Transactional
public class CategorieMetierImpl implements ICategorieMetier {

	private ICategorieDao daoCategorie = new CategorieDaoImpl();
	
	
	public void setDaoCategorie(ICategorieDao daoCategorie) {
		this.daoCategorie = daoCategorie;
	}


	@Override
	public Categorie ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		return daoCategorie.ajouterCategorie(c);
	}
	
}
