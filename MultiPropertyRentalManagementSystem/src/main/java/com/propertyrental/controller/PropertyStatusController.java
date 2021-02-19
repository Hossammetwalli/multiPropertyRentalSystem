package com.propertyrental.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.propertyrental.models.PropertyStatus;
import com.propertyrental.services.PropertyStatusService;



@Controller
public class PropertyStatusController {

	@Autowired  private PropertyStatusService propertyStatusService;

	@GetMapping("/propertyStatuses")
	public String getPropertyStatuss(Model model) {		
		
		List<PropertyStatus> PropertyStatusList = propertyStatusService.getPropertyStatuses();	

		model.addAttribute("propertyStatuses", PropertyStatusList);
		return "propertyStatus";
	}	
	
	@PostMapping("/propertyStatuses/addNew")
	public String addNew(PropertyStatus PropertyStatus) {
		propertyStatusService.save(PropertyStatus);
		return "redirect:/propertyStatuses";
	}
	
	@RequestMapping("propertyStatuses/findById")
	@ResponseBody
	public Optional<PropertyStatus> findById(int id) {
	  return propertyStatusService.findById(id);	
	}	
	
	@RequestMapping(value="/propertyStatuses/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(PropertyStatus PropertyStatus) {
		propertyStatusService.save(PropertyStatus);
		return "redirect:/propertyStatuses";
	}
	
	@RequestMapping(value="/propertyStatuses/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		propertyStatusService.delete(id);
		return "redirect:/propertyStatuses";
	}
}
