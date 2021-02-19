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

import com.propertyrental.models.PropertyRecord;
import com.propertyrental.services.LocationService;
import com.propertyrental.services.PropertyRecordService;
import com.propertyrental.services.PropertyService;



@Controller
public class PropertyRecordController {


	
	@Autowired	private PropertyRecordService propertyRecordService;
	@Autowired	private PropertyService propertyService;
	@Autowired	private LocationService locationService;


	@GetMapping("/propertyRecords")
	public String getPropertyRecords(Model model) {		
		model.addAttribute("propertyRecords", propertyRecordService.getPropertyRecord());	
		
		model.addAttribute("properties", propertyService.getProperty());
		model.addAttribute("locations", locationService.getLocations());
		

		
		return "propertyRecord";
	}	
	
	@PostMapping("/propertyRecords/addNew")
	public String addNew(PropertyRecord propertyRecord) {
		propertyRecordService.save(propertyRecord);
		return "redirect:/propertyRecords";
	}
	
	@RequestMapping("propertyRecords/findById")
	@ResponseBody
	public Optional<PropertyRecord> findById(int id) {
	  return propertyRecordService.findById(id);	
	}	
	
	@RequestMapping(value="/propertyRecords/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(PropertyRecord propertyRecord) {
		propertyRecordService.save(propertyRecord);
		return "redirect:/propertyRecords";
	}
	
	@RequestMapping(value="/propertyRecords/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		propertyRecordService.delete(id);
		return "redirect:/propertyRecords";
	}

}
