package com.apap.labor.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apap.labor.model.PemeriksaanModel;
import com.apap.labor.repository.PemeriksaanDb;

@Service
@Transactional
public class PemeriksaanServiceImpl implements PemeriksaanService {
	@Autowired
	private PemeriksaanDb pemeriksaanDb;
	
	@Override
	public List<PemeriksaanModel> getAllPermintaan() {
		return pemeriksaanDb.findAll();
	}

	
}
