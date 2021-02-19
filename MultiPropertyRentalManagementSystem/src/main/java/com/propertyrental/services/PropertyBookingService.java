package com.propertyrental.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propertyrental.models.PropertyBooking;
import com.propertyrental.repositories.PropertyBookingRepository;


@Service
public class PropertyBookingService {
	
	@Autowired
	private PropertyBookingRepository propertyBookingRepository;
	
	//Return list of Vehicle Hire
	public List<PropertyBooking> getPropertyBooking(){
		return propertyBookingRepository.findAll();
	}
	
	//SAve new VehicleHire
	public void save(PropertyBooking propertyBooking) {
		propertyBookingRepository.save(propertyBooking);
	}
	
	//get by id
	public Optional<PropertyBooking> findById(int id) {
		return propertyBookingRepository.findById(id);
	}

	public void delete(Integer id) {
		propertyBookingRepository.deleteById(id);
	}


}
