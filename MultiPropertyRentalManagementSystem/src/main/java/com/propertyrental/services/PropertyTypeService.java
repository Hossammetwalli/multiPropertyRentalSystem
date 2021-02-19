package com.propertyrental.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propertyrental.models.PropertyType;
import com.propertyrental.repositories.PropertyTypeRepository;



@Service
public class PropertyTypeService {
	@Autowired
	private PropertyTypeRepository propertyTypeRepository;
	
	//Return list of 
	public List<PropertyType> getPropertyTypes(){
		return propertyTypeRepository.findAll();
	}
	
	//SAve new VehicleType
	public void save(PropertyType propertyType) {
		propertyTypeRepository.save(propertyType);
	}
	
	//get by id
	public Optional<PropertyType> findById(int id) {
		return propertyTypeRepository.findById(id);
	}

	public void delete(Integer id) {
		propertyTypeRepository.deleteById(id);
	}

}
