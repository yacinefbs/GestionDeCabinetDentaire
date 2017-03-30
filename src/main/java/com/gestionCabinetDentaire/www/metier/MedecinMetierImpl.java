package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.dao.IMedecinDao;
import com.gestionCabinetDentaire.www.dao.MedecinDaoImpl;
import com.gestionCabinetDentaire.www.entities.Medecin;


@Transactional
public class MedecinMetierImpl implements IMedecinMetier {

	private IMedecinDao daoMedecin = new MedecinDaoImpl();
	
	
	
	public void setDaoMedecin(IMedecinDao daoMedecin) {
		this.daoMedecin = daoMedecin;
	}

	@Override
	public Medecin ajouterMedecin(Medecin m) {
		// TODO Auto-generated method stub
		return daoMedecin.ajouterMedecin(m);
	}

	@Override
	public Medecin modifierMedecin(Medecin m) {
		// TODO Auto-generated method stub
		return daoMedecin.modifierMedecin(m);
	}

	@Override
	public void supprimerMedecin(Long idMedecin) {
		// TODO Auto-generated method stub
		daoMedecin.supprimerMedecin(idMedecin);
	}

	@Override
	public Medecin findMedecinById(Long idMedecin) {
		// TODO Auto-generated method stub
		return daoMedecin.findMedecinById(idMedecin);
	}

	@Override
	public List<Medecin> findAllMedecin() {
		// TODO Auto-generated method stub
		return daoMedecin.findAllMedecin();
	}
}
