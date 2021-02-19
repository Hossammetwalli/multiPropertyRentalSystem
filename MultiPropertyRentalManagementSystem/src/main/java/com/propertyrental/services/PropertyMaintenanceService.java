package com.propertyrental.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propertyrental.models.PropertyMaintenance;
import com.propertyrental.repositories.PropertyMaintenanceRepository;



@Service
public class PropertyMaintenanceService {
	
	
	@Autowired
	private PropertyMaintenanceRepository propertyMaintenanceRepository;
	
	//Return list of vehicleMaintenances
	public List<PropertyMaintenance> getPropertyMaintenances(){
		return propertyMaintenanceRepository.findAll();
	}
	
	//SAve new vehicleMaintenance
	public void save(PropertyMaintenance propertyMaintenance) {
		propertyMaintenanceRepository.save(propertyMaintenance);
	}
	
	//get by id
	public Optional<PropertyMaintenance> findById(int id) {
		return propertyMaintenanceRepository.findById(id);
	}

	public void delete(Integer id) {
		propertyMaintenanceRepository.deleteById(id);
	}


}
