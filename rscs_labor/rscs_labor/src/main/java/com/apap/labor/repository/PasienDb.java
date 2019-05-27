package com.apap.labor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.labor.model.JadwalJagaModel;

@Repository
public interface PasienDb extends JpaRepository<JadwalJagaModel, Long> {
	
}
