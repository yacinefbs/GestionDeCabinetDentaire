package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.dao.IOrdonanceDao;
import com.gestionCabinetDentaire.www.dao.OrdonanceDaoImpl;
import com.gestionCabinetDentaire.www.entities.Ordonance;


@Transactional
public class OrdonanceMetierImpl implements IOrdonanceMetier {

	public void setDaoOrdonance(IOrdonanceDao daoOrdonance) {
		this.daoOrdonance = daoOrdonance;
	}

	private IOrdonanceDao daoOrdonance = new OrdonanceDaoImpl();
	
	@Override
	public Ordonance ajouterOrdonance(Ordonance o) {
		// TODO Auto-generated method stub
		return daoOrdonance.ajouterOrdonance(o);
	}

	@Override
	public Ordonance modifierOrdonance(Ordonance o) {
		// TODO Auto-generated method stub
		return daoOrdonance.modifierOrdonance(o);
	}

	@Override
	public void supprimerOrdonance(Long idOrdonance) {
		// TODO Auto-generated method stub
		daoOrdonance.supprimerOrdonance(idOrdonance);
	}

	@Override
	public Ordonance findOrdonanceById(Long idOrdonance) {
		// TODO Auto-generated method stub
		return daoOrdonance.findOrdonanceById(idOrdonance);
	}

	@Override
	public List<Ordonance> findAllOrdonance() {
		// TODO Auto-generated method stub
		return daoOrdonance.findAllOrdonance();
	}
}
