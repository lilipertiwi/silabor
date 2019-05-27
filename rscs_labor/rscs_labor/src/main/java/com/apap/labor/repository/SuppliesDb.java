package com.apap.labor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apap.labor.model.SuppliesModel;

public interface SuppliesDb extends JpaRepository<SuppliesModel, Long> {
	SuppliesModel findById(int id);

}
