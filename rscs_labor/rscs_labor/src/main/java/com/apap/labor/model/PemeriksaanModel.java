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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.apap.labor.model.JenisPemeriksaanModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "pemeriksaan")


public class PemeriksaanModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
    @Column(name = "tanggal_pengajuan", nullable = false)
    private Date tanggal_pengajuan;
	
//	@NotNull
//    @Column(name = "pasien", nullable = false)
//    private int pasien;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pasien_id", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private PasienModel pasien;
	
	@NotNull
    @Column(name = "tanggal_pemeriksaan", nullable = false)
    private Date tanggal_pemeriksaan;
	
//	@NotNull
//    @Column(name = "jenis", nullable = false)
//    private int jenis;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "jenis", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private JenisPemeriksaanModel jenispemeriksaan;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_jadwal", referencedColumnName = "id", nullable = false)
	@OnDelete(action = OnDeleteAction.NO_ACTION)
	@JsonIgnore
	private JadwalJagaModel jadwaljaga;
	
	
//	@NotNull
//    @Column(name = "id_jadwal", nullable = false)
//    private int id_jadwal;
	
	@NotNull
    @Column(name = "status", nullable = false)
    private int status;
	
	@NotNull
    @Size(max=255)
    @Column(name = "hasil", nullable = false)
    private String hasil;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Date getTanggal_pengajuan() {
		return tanggal_pengajuan;
	}



	public void setTanggal_pengajuan(Date tanggal_pengajuan) {
		this.tanggal_pengajuan = tanggal_pengajuan;
	}



	public PasienModel getPasien() {
		return pasien;
	}



	public void setPasien(PasienModel pasien) {
		this.pasien = pasien;
	}



	public Date getTanggal_pemeriksaan() {
		return tanggal_pemeriksaan;
	}



	public void setTanggal_pemeriksaan(Date tanggal_pemeriksaan) {
		this.tanggal_pemeriksaan = tanggal_pemeriksaan;
	}



	public JenisPemeriksaanModel getJenispemeriksaan() {
		return jenispemeriksaan;
	}



	public void setJenispemeriksaan(JenisPemeriksaanModel jenispemeriksaan) {
		this.jenispemeriksaan = jenispemeriksaan;
	}



	public JadwalJagaModel getJadwaljaga() {
		return jadwaljaga;
	}



	public void setJadwaljaga(JadwalJagaModel jadwaljaga) {
		this.jadwaljaga = jadwaljaga;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public String getHasil() {
		return hasil;
	}



	public void setHasil(String hasil) {
		this.hasil = hasil;
	}



	public PemeriksaanModel() {
		// TODO Auto-generated constructor stub
	}

}
