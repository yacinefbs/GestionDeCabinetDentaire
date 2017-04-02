package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.dao.DossierDaoImpl;
import com.gestionCabinetDentaire.www.dao.IDossierDao;
import com.gestionCabinetDentaire.www.entities.Dossier;

@Transactional
public class DossierMetierImpl implements IDossierMetier {

	
	private IDossierDao daoDossier = new DossierDaoImpl();
	
	public void setDaoDossier(IDossierDao daoDossier) {
		this.daoDossier = daoDossier;
	}

	@Override
	public Dossier ajouterDossier(Dossier d) {
		// TODO Auto-generated method stub
		return daoDossier.ajouterDossier(d);
	}

	@Override
	public Dossier modifierDossier(Dossier d) {
		// TODO Auto-generated method stub
		return daoDossier.modifierDossier(d);
	}

	@Override
	public void supprimerDossier(Long idDossier) {
		// TODO Auto-generated method stub
		daoDossier.supprimerDossier(idDossier);
	}

	@Override
	public Dossier findDossierById(Long idDossier) {
		// TODO Auto-generated method stub
		return daoDossier.findDossierById(idDossier);
	}

	@Override
	public List<Dossier> findAllDossier() {
		// TODO Auto-generated method stub
		return daoDossier.findAllDossier();
	}
	
	@Override
	public List<Dossier> findDossiersByPatientID(Long idPatient) {
		// TODO Auto-generated method stub
		return daoDossier.findDossiersByPatientID(idPatient);
	}
}
