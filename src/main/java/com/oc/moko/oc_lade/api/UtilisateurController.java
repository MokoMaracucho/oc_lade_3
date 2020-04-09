package com.oc.moko.oc_lade.api;

import org.springframework.beans.factory.annotation.Autowired;

import com.oc.moko.oc_lade.model.Utilisateur;
import com.oc.moko.oc_lade.service.UtilisateurService;

public class UtilisateurController {

	private final UtilisateurService utilisateurService;

	@Autowired
	public UtilisateurController(UtilisateurService utilisateurService) {
		this.utilisateurService = utilisateurService;
	}
	
	public void addUtilisateur(Utilisateur utilisateur) {
		utilisateurService.addUtilisateur(utilisateur);
	}
}
