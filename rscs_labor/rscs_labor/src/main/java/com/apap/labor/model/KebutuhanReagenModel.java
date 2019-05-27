package com.apap.labor.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.apap.labor.model.SuppliesModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "kebutuhan_reagen")

public class KebutuhanReagenModel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
//	@NotNull
//    @Column(name = "id_reagen", nullable = false)
//    private int id_reagen;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_reagen", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private SuppliesModel supplies;
	
	@NotNull
    @Column(name = "tanggal_update", nullable = false)
    private Date tanggal_update;

	@NotNull
    @Column(name = "jumlah", nullable = false)
    private int jumlah;
	
	@NotNull
    @Column(name = "status", nullable = false)
    private int status;
	
	
//	public int getId_reagen() {
//		return id_reagen;
//	}
//
//
//	public void setId_reagen(int id_reagen) {
//		this.id_reagen = id_reagen;
//	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public SuppliesModel getSupplies() {
		return supplies;
	}


	public void setSupplies(SuppliesModel supplies) {
		this.supplies = supplies;
	}


	public Date getTanggal_update() {
		return tanggal_update;
	}


	public void setTanggal_update(Date tanggal_update) {
		this.tanggal_update = tanggal_update;
	}


	public int getJumlah() {
		return jumlah;
	}


	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public KebutuhanReagenModel() {
		// TODO Auto-generated constructor stub
	}

}
