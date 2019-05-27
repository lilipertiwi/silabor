package com.apap.labor.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.apap.labor.model.JenisPemeriksaanModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "staff")

public class StaffModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
    @Size(max=255)
    @Column(name = "nama", nullable = false)
    private String nama;

	@OneToMany(mappedBy = "staff", fetch = FetchType.LAZY)
    private List<JadwalJagaModel> listJadwalJaga = new ArrayList<JadwalJagaModel>();

	public void setListJadwalJaga(List<JadwalJagaModel> listJadwalJaga) {
        this.listJadwalJaga = listJadwalJaga;
    }
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public List<JadwalJagaModel> getListJadwalJaga() {
        return listJadwalJaga;
    }
	

}
