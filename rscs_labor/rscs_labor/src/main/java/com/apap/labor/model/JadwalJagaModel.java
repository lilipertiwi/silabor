package com.apap.labor.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

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
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.apap.labor.model.JenisPemeriksaanModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "jadwal_jaga")

public class JadwalJagaModel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
    @Column(name = "tanggal", nullable = false)
    private String tanggal;
	
	@NotNull
    @Column(name = "waktu_mulai", nullable = false)
    private String waktu_mulai;
	
	@NotNull
    @Column(name = "waktu_selesai", nullable = false)
    private String waktu_selesai;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_staff", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private StaffModel staff;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTanggal() {
		return tanggal;
	}

	public void setTanggal(String tanggal) {
		this.tanggal = tanggal;
	}

	public String getWaktu_mulai() {
		return waktu_mulai;
	}

	public void setWaktu_mulai(String waktu_mulai) {
		this.waktu_mulai = waktu_mulai;
	}

	public String getWaktu_selesai() {
		return waktu_selesai;
	}

	public void setWaktu_selesai(String waktu_selesai) {
		this.waktu_selesai = waktu_selesai;
	}

	public StaffModel getStaff() {
		return staff;
	}

	public void setStaff(StaffModel staff) {
		this.staff = staff;
	}
	
	
	


}
