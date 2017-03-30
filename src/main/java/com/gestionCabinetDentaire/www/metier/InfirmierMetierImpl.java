package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.dao.IInfirmierDao;
import com.gestionCabinetDentaire.www.dao.InfirmierDaoImpl;
import com.gestionCabinetDentaire.www.entities.Infirmier;


@Transactional
public class InfirmierMetierImpl implements IInfirmierMetier {

	private IInfirmierDao daoInfirmier = new InfirmierDaoImpl();
	
	public void setDaoInfirmier(IInfirmierDao daoInfirmier) {
		this.daoInfirmier = daoInfirmier;
	}

	@Override
	public Infirmier ajouterInfirmier(Infirmier i) {
		// TODO Auto-generated method stub
		return daoInfirmier.ajouterInfirmier(i);
	}

	@Override
	public Infirmier modifierInfirmier(Infirmier i) {
		// TODO Auto-generated method stub
		return daoInfirmier.modifierInfirmier(i);
	}

	@Override
	public void supprimerInfirmier(Long idInfirmier) {
		// TODO Auto-generated method stub
		daoInfirmier.supprimerInfirmier(idInfirmier);
	}

	@Override
	public Infirmier findInfirmierById(Long idInfirmier) {
		// TODO Auto-generated method stub
		return daoInfirmier.findInfirmierById(idInfirmier);
	}

	@Override
	public List<Infirmier> findAllInfirmier() {
		// TODO Auto-generated method stub
		return daoInfirmier.findAllInfirmier();
	}
}
