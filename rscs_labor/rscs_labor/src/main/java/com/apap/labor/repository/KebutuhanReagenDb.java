package com.apap.labor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.labor.model.KebutuhanReagenModel;

@Repository
public interface KebutuhanReagenDb extends JpaRepository<KebutuhanReagenModel, Long> {
	
}
