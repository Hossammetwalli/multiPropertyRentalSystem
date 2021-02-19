package com.propertyrental.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propertyrental.models.PropertyRecord;
import com.propertyrental.repositories.PropertyRecordRepository;


@Service
public class PropertyRecordService {

	
	@Autowired
	private PropertyRecordRepository propertyRecordRepository;
	
	//Return list of vehicleMovements
	public List<PropertyRecord> getPropertyRecord(){
		return propertyRecordRepository.findAll();
	}
	
	//SAve new vehicleMovement
	public void save(PropertyRecord propertyRecord) {
		propertyRecordRepository.save(propertyRecord);
	}
	
	//get by id
	public Optional<PropertyRecord> findById(int id) {
		return propertyRecordRepository.findById(id);
	}

	public void delete(Integer id) {
		propertyRecordRepository.deleteById(id);
	}

}
