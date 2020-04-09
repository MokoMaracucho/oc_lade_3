package com.oc.moko.oc_lade.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oc.moko.oc_lade.model.Utilisateur;
import com.oc.moko.oc_lade.service.UtilisateurService;

@RequestMapping("oc_lade/utilisateur")
@RestController
public class UtilisateurController {

	private final UtilisateurService utilisateurService;

	@Autowired
	public UtilisateurController(UtilisateurService utilisateurService) {
		this.utilisateurService = utilisateurService;
	}
	
	@PostMapping
	public void addUtilisateur(@RequestBody Utilisateur utilisateur) {
		utilisateurService.addUtilisateur(utilisateur);
	}
	
	@GetMapping
	public List<Utilisateur> getTousUtilisateurs() {
		return utilisateurService.getTousUtilisateurs();
	}
}
