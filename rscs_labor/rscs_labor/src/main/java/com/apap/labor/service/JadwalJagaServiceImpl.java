package com.apap.labor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apap.labor.model.JadwalJagaModel;
import com.apap.labor.repository.JadwalJagaDb;

@Service("jadwalJagaService")
public class JadwalJagaServiceImpl implements JadwalJagaService{
	@Autowired
    private JadwalJagaDb jadwalJagaDb;

	@Override
	public JadwalJagaModel addJadwalJaga(JadwalJagaModel jadwalJaga) {
		// TODO Auto-generated method stub
//		jadwalJagaDb.fin
		return jadwalJagaDb.save(jadwalJaga);
	}

//	@Override
//	public List<JadwalJagaModel> getAllJadwalJaga() {
//		// TODO Auto-generated method stub
//		return jadwalJagaDb.findAll();
//	}
//
//	@Override
//	public JadwalJagaModel getJadwalJaga(int id) {
//		// TODO Auto-generated method stub
//		return jadwalJagaDb.findById(id);
//	}
//
//	@Override
//	public void updateJadwalJaga(JadwalJagaModel jadwalJaga) {
//		// TODO Auto-generated method stub
//		jadwalJagaDb.save(jadwalJaga);	
//	}
	

}
