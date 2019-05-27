package com.apap.labor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.labor.model.JenisPemeriksaanModel;

@Repository
public interface JenisPemeriksaanDb extends JpaRepository<JenisPemeriksaanModel, Long> {
	
}
