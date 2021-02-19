package com.propertyrental.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propertyrental.models.PropertyStatus;
import com.propertyrental.repositories.PropertyStatusRepository;


@Service
public class PropertyStatusService {
	@Autowired
	private PropertyStatusRepository propertyStatusRepository;
	
	//Return list of countries
	public List<PropertyStatus> getPropertyStatuses(){
		return propertyStatusRepository.findAll();
	}
	
	//SAve new VehicleStatus
	public void save(PropertyStatus propertyStatus) {
		propertyStatusRepository.save(propertyStatus);
	}
	
	//get by id
	public Optional<PropertyStatus> findById(int id) {
		return propertyStatusRepository.findById(id);
	}

	public void delete(Integer id) {
		propertyStatusRepository.deleteById(id);
	}

}
