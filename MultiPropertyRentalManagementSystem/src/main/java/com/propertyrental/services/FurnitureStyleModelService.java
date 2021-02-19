package com.propertyrental.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.propertyrental.models.FurnitureStyleModel;
import com.propertyrental.models.Property;
import com.propertyrental.repositories.FurnitureStyleModelRepository;



@Service
public class FurnitureStyleModelService {
	@Autowired
	private FurnitureStyleModelRepository furnitureStyleModelRepository;
	
	//Return list of countries
	public List<FurnitureStyleModel> getPropertyModels(){
		return furnitureStyleModelRepository.findAll();
	}
	
	//SAve new VehicleModel
	public void save(FurnitureStyleModel furnitureStyleModel) {
		furnitureStyleModelRepository.save(furnitureStyleModel);
	}
	
	//get by id
	public Optional<FurnitureStyleModel> findById(int id) {
		return furnitureStyleModelRepository.findById(id);
	}

	public void delete(Integer id) {
		furnitureStyleModelRepository.deleteById(id);
	}

}
