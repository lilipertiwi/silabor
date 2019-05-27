package com.apap.labor.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.apap.labor.model.JadwalJagaModel;
import com.apap.labor.model.StaffModel;
import com.apap.labor.service.JadwalJagaService;
import com.apap.labor.service.StaffService;



@Controller
public class JadwalJagaController {
	@Autowired
	private JadwalJagaService jadwalJagaService;
	
	@Autowired
	private StaffService staffService;
		
    @RequestMapping(value = "/lab/jadwal-jaga/tambah", method = RequestMethod.GET)
    private String add( Model model) {
        
    	List<StaffModel> staff = staffService.getAllStaff();
//        staff.setListJadwalJaga(new ArrayList<JadwalJagaModel>(){
//            private ArrayList<JadwalJagaModel> init(){
//                this.add(new JadwalJagaModel());
//                return this;
//            }
//        }.init());
    	System.out.println(staff.size());

        model.addAttribute("staff", staff);
        return "add-jadwaljaga.html";
    }

	@RequestMapping(value = "/lab/jadwal-jaga/tambah", method = RequestMethod.POST)
	private String addJadwalJaga(@ModelAttribute JadwalJagaModel jadwalJaga) {
		Optional<StaffModel> st = staffService.getStaffDetailById(1);
		jadwalJaga.setStaff(st.get());
		System.out.println(jadwalJaga);
		jadwalJagaService.addJadwalJaga(jadwalJaga);
	    return "add.html";
	}
}
