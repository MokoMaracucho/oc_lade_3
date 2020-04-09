package com.oc.moko.oc_lade.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.oc.moko.oc_lade.model.Utilisateur;

public interface UtilisateurDao {
	
	int insertUtilisateur(UUID id, Utilisateur utilisateur);
	
	default int insertUtilisateur(Utilisateur utilisateur) {
		UUID idUtilisateur = UUID.randomUUID();
		return insertUtilisateur(idUtilisateur, utilisateur);
	}
	
	List<Utilisateur> selectTousUtilisateurs();
	
	Optional<Utilisateur> selectUtilisateurById(UUID id);
	
	int deleteUtilisateurById(UUID idUtyilisateur);
	
	int updateUtilisateurById(UUID id, Utilisateur utilisateur);
}
