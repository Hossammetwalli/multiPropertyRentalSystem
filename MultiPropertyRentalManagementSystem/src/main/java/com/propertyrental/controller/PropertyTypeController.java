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

import com.propertyrental.models.PropertyType;
import com.propertyrental.services.PropertyTypeService;


@Controller
public class PropertyTypeController {

	@Autowired  private PropertyTypeService propertyTypeService;

	@GetMapping("/propertyTypes")
	public String getPropertyTypes(Model model) {		
		
		List<PropertyType> propertyTypeList = propertyTypeService.getPropertyTypes();	
	
		model.addAttribute("propertyTypes", propertyTypeList);
		return "propertyType";
	}	
	
	@PostMapping("/propertyTypes/addNew")
	public String addNew(PropertyType propertyType) {
		propertyTypeService.save(propertyType);
		return "redirect:/propertyTypes";
	}
	
	@RequestMapping("propertyTypes/findById")
	@ResponseBody
	public Optional<PropertyType> findById(int id) {
	  return propertyTypeService.findById(id);	
	}	
	
	@RequestMapping(value="/propertyTypes/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(PropertyType propertyType) {
		propertyTypeService.save(propertyType);
		return "redirect:/propertyTypes";
	}
	
	@RequestMapping(value="/propertyTypes/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		propertyTypeService.delete(id);
		return "redirect:/propertyTypes";
	}
}
