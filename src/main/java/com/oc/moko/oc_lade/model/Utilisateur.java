package com.oc.moko.oc_lade.model;

import javax.persistence.Column;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="tb_utilisateur")
public class Utilisateur {
	
	@Id
	@Column(name="id_utilisateur")
	private UUID idUtilisateur;
	@Column(name="prenom_utilisateur")
	private String prenomUtilisateur;
	@Column(name="nom_utilisateur")
	private String nomUtilisateur;

	public Utilisateur() {
	}

	public Utilisateur(
		@JsonProperty("idUtilisateur") UUID idUtilisateur,
		@JsonProperty("prenomUtilisateur") String prenomUtilisateur,
		@JsonProperty("nomUtilisateur") String nomUtilisateur
	) {
		this.idUtilisateur = idUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
	}

	public UUID getIdUtilisateur() {
		return idUtilisateur;
	}
	
	public void setIdUtilisateur(UUID idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}
	
	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}
	
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", prenomUtilisateur=" + prenomUtilisateur + ", nomUtilisateur=" + nomUtilisateur + "]";
	}
}
