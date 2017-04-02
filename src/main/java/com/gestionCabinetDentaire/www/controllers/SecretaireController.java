package com.gestionCabinetDentaire.www.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecretaireController {
	private static final Logger logger = LoggerFactory.getLogger(SecretaireController.class);
	
	
	@RequestMapping(value="/gestionSecretaire")
	public String gestionSecretaire(){
		System.out.println("ici gestion secretaire");
		
		return "gestionSecretaires";
	}
}
