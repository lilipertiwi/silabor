package com.apap.labor.service;

import java.util.List;
import com.apap.labor.model.SuppliesModel;

public interface SuppliesService {
	SuppliesModel addSupplies(SuppliesModel supplies);
	List<SuppliesModel> getAllSupplies();
	SuppliesModel getSupplies(int id);
	void updateSupplies(SuppliesModel supplies);
}
