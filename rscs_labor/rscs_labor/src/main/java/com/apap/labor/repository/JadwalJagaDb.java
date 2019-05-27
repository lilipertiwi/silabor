package com.apap.labor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.labor.model.JadwalJagaModel;
import com.apap.labor.model.SuppliesModel;

@Repository
public interface JadwalJagaDb extends JpaRepository<JadwalJagaModel, Long> {
	JadwalJagaModel findById(int id);
}
