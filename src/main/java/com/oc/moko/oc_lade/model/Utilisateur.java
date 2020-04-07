package com.oc.moko.oc_lade.model;

import java.util.UUID;

public class Utilisateur {
	
	private UUID id_utilisateur;
	private String prenom_utilisateur;
	private String nom_utilisateur;
	
	public UUID getId_utilisateur() {
		return id_utilisateur;
	}
	
	public void setId_utilisateur(UUID id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}
	
	public String getPrenom_utilisateur() {
		return prenom_utilisateur;
	}
	
	public void setPrenom_utilisateur(String prenom_utilisateur) {
		this.prenom_utilisateur = prenom_utilisateur;
	}
	
	public String getNom_utilisateur() {
		return nom_utilisateur;
	}
	
	public void setNom_utilisateur(String nom_utilisateur) {
		this.nom_utilisateur = nom_utilisateur;
	}
}
