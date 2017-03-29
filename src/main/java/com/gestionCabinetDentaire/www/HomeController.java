package com.gestionCabinetDentaire.www;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gestionCabinetDentaire.www.entities.Categorie;
import com.gestionCabinetDentaire.www.metier.CategorieMetierImpl;
import com.gestionCabinetDentaire.www.metier.ICategorieMetier;
import com.gestionCabinetDentaire.www.models.PatientForm;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	ICategorieMetier metierCategorie = new CategorieMetierImpl();
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Categorie c = new Categorie();
		c.setNomCategorie("Cat1");
		metierCategorie.ajouterCategorie(c);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/accueil")
	public String accueil(@Valid PatientForm bf, BindingResult bindingResult, Model model){
		if(bindingResult.hasErrors()){
			return "accueil";
		}
		
		PatientForm patientForm = new PatientForm();
		model.addAttribute("patientForm", patientForm);
		return "accueil";
	}
	
}
