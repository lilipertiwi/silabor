package com.apap.labor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apap.labor.model.JadwalJagaModel;
import com.apap.labor.model.StaffModel;
import com.apap.labor.repository.JadwalJagaDb;
import com.apap.labor.repository.StaffDb;

@Service("staffService")
public class StaffServiceImpl implements StaffService{
	@Autowired
    private StaffDb staffDb;


//	@Override
//	public StaffModel addStaff(StaffModel staff) {
//		// TODO Auto-generated method stub
//		return staffDb.save(staff);
//	}
//
//	
	@Override
	public List<StaffModel> getAllStaff() {
		// TODO Auto-generated method stub
		return staffDb.findAll();
	}


	@Override
	public Optional<StaffModel> getStaffDetailById(int id) {
		// TODO Auto-generated method stub
//		staffDb.find
		return staffDb.findById(id);
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
