package com.oc.moko.oc_lade.dao;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.oc.moko.oc_lade.model.Utilisateur;

@Repository
public class UtilisateurDataAccessService implements UtilisateurDao {

	@Override
	public int insertUtilisateur(UUID id, Utilisateur utilisateur) {
		return 0;
	}

}
