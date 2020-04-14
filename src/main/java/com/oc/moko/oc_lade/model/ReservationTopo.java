package com.oc.moko.oc_lade.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="tb_reservation_topo")
public class ReservationTopo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotBlank
	@Column(name="id_reservation_topo")
	private UUID idReservationTopo;

	@NotBlank
	@Enumerated(EnumType.STRING)
	@Column(name="statut_reservation_topo")
	private StatutReservation statutReservationTopo;

	@NotBlank
	@ManyToOne
	private Topo topo;
	@NotBlank
	@ManyToOne
	private Utilisateur demandeurReservationTopo;
	
	public UUID getIdReservationTopo() {
		return idReservationTopo;
	}
	
	public void setIdReservationTopo(UUID idReservationTopo) {
		this.idReservationTopo = idReservationTopo;
	}

	public StatutReservation getStatutReservationTopo() {
		return statutReservationTopo;
	}

	public void setStatutReservationTopo(StatutReservation statutReservationTopo) {
		this.statutReservationTopo = statutReservationTopo;
	}
}