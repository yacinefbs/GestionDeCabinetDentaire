package com.gestionCabinetDentaire.www.controllers;


import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gestionCabinetDentaire.www.entities.Categorie;
import com.gestionCabinetDentaire.www.entities.Dossier;
import com.gestionCabinetDentaire.www.entities.Infirmier;
import com.gestionCabinetDentaire.www.entities.Medecin;
import com.gestionCabinetDentaire.www.entities.Ordonance;
import com.gestionCabinetDentaire.www.entities.Paiement;
import com.gestionCabinetDentaire.www.entities.Patient;
import com.gestionCabinetDentaire.www.entities.Rdv;
import com.gestionCabinetDentaire.www.entities.Secretaire;
import com.gestionCabinetDentaire.www.entities.Specialite;
import com.gestionCabinetDentaire.www.entities.Visite;
import com.gestionCabinetDentaire.www.metier.CategorieMetierImpl;
import com.gestionCabinetDentaire.www.metier.DossierMetierImpl;
import com.gestionCabinetDentaire.www.metier.ICategorieMetier;
import com.gestionCabinetDentaire.www.metier.IDossierMetier;
import com.gestionCabinetDentaire.www.metier.IInfirmierMetier;
import com.gestionCabinetDentaire.www.metier.IMedecinMetier;
import com.gestionCabinetDentaire.www.metier.IOrdonanceMetier;
import com.gestionCabinetDentaire.www.metier.IPaiementMetier;
import com.gestionCabinetDentaire.www.metier.IPatientMetier;
import com.gestionCabinetDentaire.www.metier.IRdvMetier;
import com.gestionCabinetDentaire.www.metier.ISecretaireMetier;
import com.gestionCabinetDentaire.www.metier.ISpecialiteMetier;
import com.gestionCabinetDentaire.www.metier.IVisiteMetier;
import com.gestionCabinetDentaire.www.metier.InfirmierMetierImpl;
import com.gestionCabinetDentaire.www.metier.MedecinMetierImpl;
import com.gestionCabinetDentaire.www.metier.OrdonanceMetierImpl;
import com.gestionCabinetDentaire.www.metier.PaiementMetierImpl;
import com.gestionCabinetDentaire.www.metier.PatientMetierImpl;
import com.gestionCabinetDentaire.www.metier.RdvMetierImpl;
import com.gestionCabinetDentaire.www.metier.SecretaireMetierImpl;
import com.gestionCabinetDentaire.www.metier.SpecialiteMetierImpl;
import com.gestionCabinetDentaire.www.metier.VisiteMetierImpl;
import com.gestionCabinetDentaire.www.models.PatientForm;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PatientController {
	
	private static final Logger logger = LoggerFactory.getLogger(PatientController.class);
	
	@Autowired
	private IPatientMetier metierPatient = new PatientMetierImpl();
	@Autowired
	private ICategorieMetier metierCategorie = new CategorieMetierImpl();
	@Autowired
	private IDossierMetier metierDossier = new DossierMetierImpl();
	@Autowired
	private IInfirmierMetier metierInfirmier = new InfirmierMetierImpl();
	@Autowired
	private IMedecinMetier metierMedecin = new MedecinMetierImpl();
	@Autowired
	private IOrdonanceMetier metierOrdonance = new OrdonanceMetierImpl();
	@Autowired
	private IPaiementMetier metierPaiement = new PaiementMetierImpl();
	@Autowired
	private IRdvMetier metierRdv = new RdvMetierImpl();
	@Autowired
	private ISecretaireMetier metierSecretaire = new SecretaireMetierImpl();
	@Autowired
	private ISpecialiteMetier metierSpecialite = new SpecialiteMetierImpl();
	@Autowired
	private IVisiteMetier metierVisite = new VisiteMetierImpl();
	
	
	
	@RequestMapping(value="/ajouterPatient")
	public String ajouterPatient(@Valid PatientForm pf, BindingResult bindingResult, Model model){
		System.out.println("nom : " + pf.getPatient().getNom());
//		metierCategorie.ajouterCategorie(new Categorie("naouiCat"));
//		metierDossier.ajouterDossier(new Dossier(new Date(), "seance1", "remarque1"));
//		metierInfirmier.ajouterInfirmier(new Infirmier("yacinefbsInf", "123Inf"));
//		metierMedecin.ajouterMedecin(new Medecin("medecin", "medecin"));
//		metierOrdonance.ajouterOrdonance(new Ordonance("titre1", new Date(), "obs1", "traitement1"));
//		metierPaiement.ajouterpaiement(new Paiement(1, "observation", 100, "typePaiement"));
//		metierRdv.ajouterRdv(new Rdv(new Date(), new Date(), "motif"));
//		metierSecretaire.ajouterSecretaire(new Secretaire("sec1", "sec1"));
//		metierSpecialite.ajouterSpecialite(new Specialite("spec"));
//		metierVisite.ajouterVisite(new Visite());
		
		
		pf.getPatient().setDossiers(metierDossier.findDossiersByPatientID(0L));
		pf.getPatient().setRdvs(metierRdv.findRdsByPatientID(0L));
		
		metierPatient.ajouterPatient(pf.getPatient());
		PatientForm patientForm = new PatientForm();
		model.addAttribute("patientForm", patientForm);
		
		System.out.println("Ajout avec succès - patient !!!");
		return "ajouterPatient";
	}
	
	@RequestMapping(value="/ajouterPatientForm")
	public String ajouterPatientForm(@Valid PatientForm pf, BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			return "ajouterPatient";
		}
		
		PatientForm patientForm = new PatientForm();
		model.addAttribute("patientForm", patientForm);
		return "ajouterPatient";
	}
	
	@RequestMapping(value="/listePatients")
	public String listePatients(@Valid PatientForm pf, BindingResult bindingResult, Model model){
		
		
		
		pf.setPatients(metierPatient.findAllPatients());
		model.addAttribute("listPatients", pf);
		return "listePatients";
	}
	
	@RequestMapping(value="/editerPatient")
	public String editerPatient(@RequestParam("idPatient") Long idPatient,@Valid PatientForm pf, BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			return "editerPatient";
		}
		
		Patient p = new Patient();
		p = metierPatient.findPatientById(idPatient);

		pf.setPatient(p);
		
		model.addAttribute("listPatients", pf);
		return "editerPatient";
	}
	
	@RequestMapping(value="/modifierPatient")
	public String editerPatient(@Valid PatientForm pf, BindingResult bindingResult, Model model,
			HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes
			){
		
		if(bindingResult.hasErrors()){
			return "editerPatient";
		}
		
		Patient p = new Patient();
		pf.getPatient().setDossiers(metierDossier.findDossiersByPatientID(pf.getPatient().getIdPersonne()));
		pf.getPatient().setRdvs(metierRdv.findRdsByPatientID(pf.getPatient().getIdPersonne()));
		p = metierPatient.modifierPatient(pf.getPatient());
		
		//Message of success
//		redirectAttributes.addFlashAttribute("SUCCESS_MESSAGE", "Les informations de ce patient sont mises à jour !!!");
		
		model.addAttribute("patientForm", new PatientForm());
		return "editerPatient"; //return "redirect:addNew/success";
	}
	
	
	@RequestMapping(value="/supprimerPatient")
	public String supprimerPatient(@RequestParam("idPatient") Long idPatient, @Valid PatientForm pf, BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			return "listePatients";
		}
		

		//Ajoter le type de return à la méthode de la suppression
		Patient p = new Patient();
		p = metierPatient.findPatientById(idPatient);
		
		if(p == null){
			return "listePatients?notFound=" + idPatient;
		}
		metierPatient.supprimerPatient(p);
		
		pf.setPatients(metierPatient.findAllPatients());
		model.addAttribute("listPatients", pf);
		return "listePatients";
	}
	
	
	
}
