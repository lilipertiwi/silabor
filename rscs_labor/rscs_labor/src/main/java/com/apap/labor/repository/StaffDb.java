package com.apap.labor.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.labor.model.JadwalJagaModel;
import com.apap.labor.model.StaffModel;


@Repository
public interface StaffDb extends JpaRepository<StaffModel, Long> {
	Optional<StaffModel> findById(int id);
	
}
