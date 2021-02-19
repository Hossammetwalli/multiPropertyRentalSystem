package com.propertyrental.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.propertyrental.models.PropertyMaintenance;
import com.propertyrental.services.PropertyMaintenanceService;
import com.propertyrental.services.PropertyService;
import com.propertyrental.services.SupplierService;



@Controller
public class PropertyMaintenanceController {

	
	@Autowired	private PropertyMaintenanceService propertyMaintenanceService;
	@Autowired	private PropertyService propertyService;
	@Autowired	private SupplierService supplierService;


	@GetMapping("/propertyMaintenances")
	public String getPropertyMaintenances(Model model) {		
		model.addAttribute("propertyMaintenances", propertyMaintenanceService.getPropertyMaintenances());	
		
		model.addAttribute("properties", propertyService.getProperty());
		model.addAttribute("suppliers", supplierService.getSuppliers());
		

		
		return "propertyMaintenance";
	}	
	
	@PostMapping("/propertyMaintenances/addNew")
	public String addNew(PropertyMaintenance propertyMaintenance) {
		propertyMaintenanceService.save(propertyMaintenance);
		return "redirect:/propertyMaintenances";
	}
	
	@RequestMapping("propertyMaintenances/findById")
	@ResponseBody
	public Optional<PropertyMaintenance> findById(int id) {
	  return propertyMaintenanceService.findById(id);	
	}	
	
	@RequestMapping(value="/propertyMaintenances/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(PropertyMaintenance propertyMaintenance) {
		propertyMaintenanceService.save(propertyMaintenance);
		return "redirect:/propertyMaintenances";
	}
	
	@RequestMapping(value="/propertyMaintenances/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		propertyMaintenanceService.delete(id);
		return "redirect:/propertyMaintenances";
	}

}
