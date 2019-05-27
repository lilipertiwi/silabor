package com.apap.labor.service;

import java.util.List;
import java.util.Optional;

import com.apap.labor.model.JadwalJagaModel;
import com.apap.labor.model.StaffModel;


public interface StaffService {
//	StaffModel addStaff(StaffModel staff);
	List<StaffModel> getAllStaff();
	Optional<StaffModel> getStaffDetailById(int id);
//	JadwalJagaModel getJadwalJaga(int id);
//	void updateJadwalJaga(JadwalJagaModel jadwaljaga);
}
