package com.apap.labor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.apap.labor.model.SuppliesModel;
import com.apap.labor.service.SuppliesService;

@Controller
public class SuppliesController {
	@Autowired
	private SuppliesService suppliesService;
	
	@RequestMapping(value = "/lab/stok/tambah", method = RequestMethod.GET)
	private String add(Model model) {
		model.addAttribute("supplies", new SuppliesModel());
	    return "add-supplies.html";
	}
	
	@RequestMapping(value = "/lab/stok/tambah", method = RequestMethod.POST)
	private String addSupplies(@ModelAttribute SuppliesModel supplies) {
		suppliesService.addSupplies(supplies);
	    return "add.html";
	}
	 
	@RequestMapping(value= "/lab/stok", method = RequestMethod.GET)
	public String viewSupplies(Model model) {
		List<SuppliesModel> supplies = suppliesService.getAllSupplies();
		if(supplies != null) {
			model.addAttribute("supplies", supplies);
			model.addAttribute("page", "View Supplies");
			return "view-supplies.html";	
		}else {
			model.addAttribute("page", "Error");
			return "error-messsage-supplies.html";
		}
	}
	
	@RequestMapping(value = "/lab/stok/ubah/{id}", method = RequestMethod.GET)
	public String updateSupplies(@PathVariable(value = "id") int id, Model model) {
		SuppliesModel supplies = suppliesService.getSupplies(id);
		model.addAttribute("supplies", supplies);
		model.addAttribute("page", "Update Supplies");
		return "update-supplies.html";	
	}
	
	@RequestMapping(value = "/lab/stok/ubah/{id}", method = RequestMethod.POST)
	private String updateSuppliesSubmit(@ModelAttribute SuppliesModel supplies, int id, Model model) {
		suppliesService.updateSupplies(supplies);
		model.addAttribute("page", "Update Flight");
		return "update-info.html";
	}

}
