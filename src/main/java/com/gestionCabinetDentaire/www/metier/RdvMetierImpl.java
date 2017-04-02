package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.dao.IRdvDao;
import com.gestionCabinetDentaire.www.dao.RdvDaoImpl;
import com.gestionCabinetDentaire.www.entities.Rdv;

@Transactional
public class RdvMetierImpl implements IRdvMetier {

	private IRdvDao daoRdv = new RdvDaoImpl();
	
	
	
	public void setDaoRdv(IRdvDao daoRdv) {
		this.daoRdv = daoRdv;
	}

	@Override
	public Rdv ajouterRdv(Rdv r) {
		// TODO Auto-generated method stub
		return daoRdv.ajouterRdv(r);
	}

	@Override
	public Rdv modifierRdv(Rdv r) {
		// TODO Auto-generated method stub
		return daoRdv.modifierRdv(r);
	}

	@Override
	public void supprimerRdv(Long idRdv) {
		// TODO Auto-generated method stub
		daoRdv.supprimerRdv(idRdv);
	}

	@Override
	public Rdv findRdvById(Long idRdv) {
		// TODO Auto-generated method stub
		return daoRdv.findRdvById(idRdv);
	}

	@Override
	public List<Rdv> findAllRdv() {
		// TODO Auto-generated method stub
		return daoRdv.findAllRdv();
	}
	
	@Override
	public List<Rdv> findRdsByPatientID(Long idPatient) {
		// TODO Auto-generated method stub
		return daoRdv.findRdsByPatientID(idPatient);
	}
}