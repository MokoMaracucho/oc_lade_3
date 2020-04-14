package com.oc.moko.oc_lade.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="tb_topo")
public class Topo {

    @Id
	@NotBlank
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_topo")
	private UUID idTopo;

	@NotBlank
	@Column(name="nom_topo")
	private String nomTopo;
	@NotBlank
	@Column(name="region_topo")
	private String regionTopo;
	@NotBlank
	@Column(name="description_topo")
	private String descriptionTopo;
	@NotBlank
	@Column(name="date_parution_topo")
	private Timestamp dateParutionTopo;
	@NotBlank
	@Column(name="disponibilite_topo")
	private Boolean disponibiliteTopo;
	
	@NotBlank
	@ManyToOne
	private Utilisateur utilisateur;

	@OneToMany(mappedBy="ReservationTopo")
	private List<ReservationTopo> listeReservationTopo;

	public UUID getIdTopo() {
		return idTopo;
	}
	
	public void setIdTopo(UUID idTopo) {
		this.idTopo = idTopo;
	}
	
	public String getNomTopo() {
		return nomTopo;
	}

	public void setNomTopo(String nomTopo) {
		this.nomTopo = nomTopo;
	}

	public String getRegionTopo() {
		return regionTopo;
	}

	public void setRegionTopo(String regionTopo) {
		this.regionTopo = regionTopo;
	}

	public String getDescriptionTopo() {
		return descriptionTopo;
	}
	
	public void setDescriptionTopo(String descriptionTopo) {
		this.descriptionTopo = descriptionTopo;
	}
	
	public Timestamp getDateParutionTopo() {
		return dateParutionTopo;
	}
	
	public void setDateParutionTopo(Timestamp dateParutionTopo) {
		this.dateParutionTopo = dateParutionTopo;
	}
	public Boolean getDisponibiliteTopo() {
		return disponibiliteTopo;
	}

	public void setDisponibiliteTopo(Boolean disponibiliteTopo) {
		this.disponibiliteTopo = disponibiliteTopo;
	}
}
