package com.oc.moko.oc_lade.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping(path="{id_utilisateur}")
	public Utilisateur getUtilisateurById(@PathVariable("id_utilisateur") UUID idUtilisateur) {
		return utilisateurService.getUtilisateurById(idUtilisateur)
				.orElse(null);
	}
	
	@DeleteMapping(path="{id_utilisateur}")
	public void deletePersonById(@PathVariable("id_utilisateur") UUID idUtilisateur) {
		utilisateurService.deleteUtilisateurById(idUtilisateur);
	}
	
	@PutMapping(path="{idUtilisateur}")
	public void updateUtilisateurById(@PathVariable("idUtilisateur") UUID idUtilisateur, @RequestBody Utilisateur utilisateur) {
		utilisateurService.updateUtilisateurById(idUtilisateur, utilisateur);
	}
}
