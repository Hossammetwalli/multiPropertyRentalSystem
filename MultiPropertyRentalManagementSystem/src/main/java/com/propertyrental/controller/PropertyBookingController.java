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

import com.propertyrental.models.PropertyBooking;
import com.propertyrental.services.ClientService;
import com.propertyrental.services.LocationService;
import com.propertyrental.services.PropertyBookingService;
import com.propertyrental.services.PropertyService;



@Controller
public class PropertyBookingController {


	@Autowired  private PropertyBookingService propertyBookingService;
	@Autowired  private PropertyService propertyService;
	@Autowired  private LocationService locationService;
	@Autowired  private ClientService clientService;


	@GetMapping("/propertyBookings")
	public String getPropertyBooking(Model model) {		
		
		model.addAttribute("propertyBookings", propertyBookingService.getPropertyBooking());
		model.addAttribute("properties", propertyService.getProperty());
		model.addAttribute("locations", locationService.getLocations());
		model.addAttribute("clients", clientService.getClients());

		return "propertyBookings";
	}	
	
	@PostMapping("/propertyBookings/addNew")
	public String addNew(PropertyBooking propertyBooking) {
		propertyBookingService.save(propertyBooking);
		return "redirect:/propertyBookings";
	}
	
	@RequestMapping("propertyBookings/findById")
	@ResponseBody
	public Optional<PropertyBooking> findById(int id) {
	  return propertyBookingService.findById(id);	
	}	
	
	@RequestMapping(value="/propertyBookings/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(PropertyBooking propertyBooking) {
		propertyBookingService.save(propertyBooking);
		return "redirect:/propertyBookings";
	}
	
	@RequestMapping(value="/propertyBookings/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		propertyBookingService.delete(id);
		return "redirect:/propertyBookings";
	}
}
