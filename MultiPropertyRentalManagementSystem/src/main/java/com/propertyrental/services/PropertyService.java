package com.propertyrental.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propertyrental.models.Property;
import com.propertyrental.repositories.PropertyRepository;



@Service
public class PropertyService {

	@Autowired
	private PropertyRepository propertyRepository;
	
	//Return list of vehicles
	public List<Property> getProperty(){
		return propertyRepository.findAll();
	}
	
	//SAve new vehicle
	public void save(Property property) {
		propertyRepository.save(property);
	}
	
	//get by id
	public Optional<Property> findById(int id) {
		return propertyRepository.findById(id);
	}

	public void delete(Integer id) {
		propertyRepository.deleteById(id);
	}
	
 
}
