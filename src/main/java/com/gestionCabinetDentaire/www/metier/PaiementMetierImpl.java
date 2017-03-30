package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.dao.IPaiementDao;
import com.gestionCabinetDentaire.www.dao.PaiementDaoImpl;
import com.gestionCabinetDentaire.www.entities.Paiement;


@Transactional
public class PaiementMetierImpl implements IPaiementMetier, IPaiementDao {

	private IPaiementDao daoPaiement = new PaiementDaoImpl();
	
	
	
	public void setDaoPaiement(IPaiementDao daoPaiement) {
		this.daoPaiement = daoPaiement;
	}

	@Override
	public Paiement ajouterpaiement(Paiement p) {
		// TODO Auto-generated method stub
		return daoPaiement.ajouterpaiement(p);
	}

	@Override
	public Paiement modifierpaiement(Paiement p) {
		// TODO Auto-generated method stub
		return daoPaiement.modifierpaiement(p);
	}

	@Override
	public void supprimerpaiement(Long idPaiement) {
		// TODO Auto-generated method stub
		daoPaiement.supprimerpaiement(idPaiement);
	}

	@Override
	public Paiement findpaiementById(Long idPaiement) {
		// TODO Auto-generated method stub
		return daoPaiement.findpaiementById(idPaiement);
	}

	@Override
	public List<Paiement> findAllPaiement() {
		// TODO Auto-generated method stub
		return daoPaiement.findAllPaiement();
	}

}
