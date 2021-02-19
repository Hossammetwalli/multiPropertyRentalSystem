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

import com.propertyrental.models.Property;
import com.propertyrental.services.EmployeeService;
import com.propertyrental.services.FurnitureStyleModelService;
import com.propertyrental.services.LocationService;
import com.propertyrental.services.PropertyOwnershipService;
import com.propertyrental.services.PropertyService;
import com.propertyrental.services.PropertyStatusService;
import com.propertyrental.services.PropertyTypeService;


@Controller
public class PropertyController {

	
	
	@Autowired	private PropertyService propertyService;
	@Autowired	private LocationService locationService;
	@Autowired	private EmployeeService employeeService;
	@Autowired	private PropertyOwnershipService propertyOwnershipService;
	@Autowired	private PropertyStatusService propertyStatusService;
	@Autowired	private PropertyTypeService propertyTypeService;
	@Autowired	private FurnitureStyleModelService furnitureStyleModelService;


	@GetMapping("/properties")
	public String getProperties(Model model) {	
		
		model.addAttribute("properties", propertyService.getProperty());			
		model.addAttribute("locations", locationService.getLocations());		
	    model.addAttribute("employees", employeeService.getEmployees());
		model.addAttribute("propertyOwnership", propertyOwnershipService.getPropertyOwnership());			
		model.addAttribute("propertyStatuses", propertyStatusService.getPropertyStatuses());		
		model.addAttribute("propertyTypes", propertyTypeService.getPropertyTypes());
		model.addAttribute("propertyModels", furnitureStyleModelService.getPropertyModels());				
		return "properties";
	}	
	
	@PostMapping("/properties/addNew")
	public String addNew(Property property) {
		propertyService.save(property);
		return "redirect:/properties";
	}
	
	@RequestMapping("properties/findById")
	@ResponseBody
	public Optional<Property> findById(int id) {
	  return propertyService.findById(id);	
	}	
	
	@RequestMapping(value="/properties/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Property property) {
		propertyService.save(property);
		return "redirect:/properties";
	}
	
	@RequestMapping(value="/properties/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		propertyService.delete(id);
		return "redirect:/properties";
	}
	
}
