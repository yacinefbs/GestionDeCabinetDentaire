package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.dao.ISecretaireDao;
import com.gestionCabinetDentaire.www.dao.SecretaireDaoImpl;
import com.gestionCabinetDentaire.www.entities.Secretaire;

@Transactional
public class SecretaireMetierImpl implements ISecretaireMetier {

	private ISecretaireDao daoSecretaire = new SecretaireDaoImpl();
	
	
	
	public void setDaoSecretaire(ISecretaireDao daoSecretaire) {
		this.daoSecretaire = daoSecretaire;
	}

	@Override
	public Secretaire ajouterSecretaire(Secretaire s) {
		// TODO Auto-generated method stub
		return daoSecretaire.ajouterSecretaire(s);
	}

	@Override
	public Secretaire modifierSecretaire(Secretaire s) {
		// TODO Auto-generated method stub
		return daoSecretaire.modifierSecretaire(s);
	}

	@Override
	public void supprimerSecretaire(Long idSecretaire) {
		// TODO Auto-generated method stub
		daoSecretaire.supprimerSecretaire(idSecretaire);
	}

	@Override
	public Secretaire findSecretaireById(Long idSecretaire) {
		// TODO Auto-generated method stub
		return daoSecretaire.findSecretaireById(idSecretaire);
	}

	@Override
	public List<Secretaire> findAllSecretaire() {
		// TODO Auto-generated method stub
		return daoSecretaire.findAllSecretaire();
	}
}
