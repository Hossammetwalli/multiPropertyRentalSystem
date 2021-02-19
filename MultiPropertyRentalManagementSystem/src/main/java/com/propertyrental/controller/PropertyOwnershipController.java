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

import com.propertyrental.models.PropertyOwnership;
import com.propertyrental.services.PropertyOwnershipService;



@Controller
public class PropertyOwnershipController {

	@Autowired  private PropertyOwnershipService propertyOwnershipService;

	@GetMapping("/propertyOwnerships")
	public String getStates(Model model) {		

		List<PropertyOwnership> propertyOwnershipList = propertyOwnershipService.getPropertyOwnership();
		
		model.addAttribute("propertyOwnerships", propertyOwnershipList);
		return "propertyOwnership";
	}	
	
	@PostMapping("/propertyOwnerships/addNew")
	public String addNew(PropertyOwnership propertyOwnership) {
		propertyOwnershipService.save(propertyOwnership);
		return "redirect:/propertyOwnerships";
	}
	
	@RequestMapping("propertyOwnerships/findById")
	@ResponseBody
	public Optional<PropertyOwnership> findById(int id) {
	  return propertyOwnershipService.findById(id);	
	}	
	
	@RequestMapping(value="/propertyOwnerships/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(PropertyOwnership propertyOwnership) {
		propertyOwnershipService.save(propertyOwnership);
		return "redirect:/propertyOwnerships";
	}
	
	@RequestMapping(value="/propertyOwnerships/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		propertyOwnershipService.delete(id);
		return "redirect:/propertyOwnerships";
	}
}
