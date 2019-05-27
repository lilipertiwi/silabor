package com.apap.labor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apap.labor.model.SuppliesModel;
import com.apap.labor.repository.SuppliesDb;

@Service("suppliseService")
public class SuppliesServiceImpl implements SuppliesService{
	@Autowired
    private SuppliesDb suppliesDb;

	@Override
	public SuppliesModel addSupplies(SuppliesModel supplies) {
		// TODO Auto-generated method stub
		return suppliesDb.save(supplies);
	}

	@Override
	public List<SuppliesModel> getAllSupplies() {
		// TODO Auto-generated method stub
		return suppliesDb.findAll();
	}

	@Override
	public SuppliesModel getSupplies(int id) {
		// TODO Auto-generated method stub
		return suppliesDb.findById(id);
	}

	@Override
	public void updateSupplies(SuppliesModel supplies) {
		// TODO Auto-generated method stub
		suppliesDb.save(supplies);	
	}
	

}
