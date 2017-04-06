package com.gestionCabinetDentaire.www.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gestionCabinetDentaire.www.entities.Dossier;
import com.gestionCabinetDentaire.www.metier.DossierMetierImpl;
import com.gestionCabinetDentaire.www.metier.IDossierMetier;
import com.gestionCabinetDentaire.www.metier.IMedecinMetier;
import com.gestionCabinetDentaire.www.metier.IPatientMetier;
import com.gestionCabinetDentaire.www.metier.MedecinMetierImpl;
import com.gestionCabinetDentaire.www.metier.PatientMetierImpl;
import com.gestionCabinetDentaire.www.models.DossierForm;

@Controller
public class DossierController {
	private static final Logger logger = LoggerFactory.getLogger(DossierController.class);
	
	@Autowired
	private IDossierMetier metierDossier = new DossierMetierImpl();
	@Autowired
	private IPatientMetier metierPatient = new PatientMetierImpl();
	@Autowired
	private IMedecinMetier metierMedecin = new MedecinMetierImpl();
	
	@RequestMapping(value="/listeDossiers")
	public String listeDossiers(@Valid DossierForm df ,Model model){
		
		df.setDossiers(metierDossier.findAllDossier());
		model.addAttribute("listDossiers", df);
		return "listeDossiers";
	}
	
	@RequestMapping(value="/ajouterDossierForm")
	public String ajouterDossierForm(@Valid DossierForm df, BindingResult bindingResult, Model model){
		
		
		if(bindingResult.hasErrors()){
			return "ajouterDossier";
		}
		
		df = new DossierForm();
		model.addAttribute("dossierForm", df);
		return "ajouterDossier";
	}
	
	@RequestMapping(value="/ajouterDossier")
	public String ajouterDossier(@Valid DossierForm df, BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			return "ajouterDossier";
		}
		
		metierDossier.ajouterDossier(df.getDossier());
		df = new DossierForm();
		model.addAttribute("dossierForm", df);
		return "ajouterDossier";
	}
	@RequestMapping(value="/editerDossier")
	public String editerDossier(@RequestParam("idDossier") Long idDossier,@Valid DossierForm df, BindingResult bindingResult, Model model){
		
		System.out.println("editer dossier");
		if(bindingResult.hasErrors()){
			return "listeDossiers";
		}
		
		Dossier d = new Dossier();
		d = metierDossier.findDossierById(idDossier);
		df.setDossier(d);
		model.addAttribute("dossier", df);
		
		return "editerDossier";
	}
	
	@RequestMapping(value="/modifierDossier")
	public String editerDossier(@Valid DossierForm df, BindingResult bindingResult, Model model){
		System.out.println("1");
		
		if(bindingResult.hasErrors()){
			return "editerDossier";
		}
		System.out.println("2");
		Dossier d = new Dossier();
		df.getDossier().setPatient(metierPatient.findPatientById(df.getDossier().getPatient().getIdPersonne()));
		System.out.println("3");
		df.getDossier().setMedecin(metierMedecin.findMedecinById(df.getDossier().getMedecin().getIdPersonne()));
		System.out.println("4");
		d = metierDossier.modifierDossier(df.getDossier());
		System.out.println("5");
		df = new DossierForm();
		model.addAttribute("dossier", df);
		System.out.println("6");
		return "editerDossier";
	}
	
	@RequestMapping(value="/supprimerDossier")
	public String supprimerDossier(@RequestParam("idDossier") Long idDossier, @Valid DossierForm df, BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			return "listeDossiers";
		}
		
		Dossier d = new Dossier();
		d = metierDossier.findDossierById(idDossier);
		
		if(d == null){
			return "listeDossiers?notFound" + idDossier;
		}
		metierDossier.supprimerDossier(d.getIdDossier());
		df.setDossiers(metierDossier.findAllDossier());
		model.addAttribute("listDossiers", df);
		
		return "listeDossiers";
	}
	
}
