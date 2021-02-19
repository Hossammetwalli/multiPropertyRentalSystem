package com.propertyrental.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propertyrental.models.PropertyOwnership;
import com.propertyrental.repositories.PropertyOwnershipRepository;


@Service
public class PropertyOwnershipService {
	@Autowired
	private PropertyOwnershipRepository propertyOwnershipRepository;
	
	//Return list of countries
	public List<PropertyOwnership> getPropertyOwnership(){
		return propertyOwnershipRepository.findAll();
	}
	
	//SAve new VehicleMake
	public void save(PropertyOwnership propertyOwnership) {
		propertyOwnershipRepository.save(propertyOwnership);
	}
	
	//get by id
	public Optional<PropertyOwnership> findById(int id) {
		return propertyOwnershipRepository.findById(id);
	}

	public void delete(Integer id) {
		propertyOwnershipRepository.deleteById(id);
	}

}
