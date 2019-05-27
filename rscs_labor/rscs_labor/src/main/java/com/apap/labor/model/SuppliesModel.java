package com.apap.labor.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "lab_supplies")

public class SuppliesModel implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
    @Size(max=255)
    @Column(name = "jenis", nullable = false)
    private String jenis;
	
	@NotNull
    @Size(max=255)
    @Column(name = "nama", nullable = false)
    private String nama;
	
	@NotNull
    @Column(name = "jumlah", nullable = false)
    private int jumlah;
	
	@NotNull
    @Size(max=255)
    @Column(name = "deskripsi", nullable = false)
    private String deskripsi;
	
//	@OneToMany(mappedBy = "lab_supplies", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<SuppliesModel> listSupplies;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJenis() {
		return jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public String getDeskripsi() {
		return deskripsi;
	}

	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}
	
//	public List<SuppliesModel> getAllSupplies() {
//        return listSupplies;
//    }

}
