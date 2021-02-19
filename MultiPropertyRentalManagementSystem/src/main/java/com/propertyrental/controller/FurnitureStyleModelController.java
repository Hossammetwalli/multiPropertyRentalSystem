package com.propertyrental.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.propertyrental.models.FurnitureStyleModel;
import com.propertyrental.services.FurnitureStyleModelService;


@Controller
public class FurnitureStyleModelController {

	@Autowired  private FurnitureStyleModelService furnitureStyleModelService;

	@GetMapping("/furnitureStyleModels")
	public String getVehicleModels(Model model) {		
		
		List<FurnitureStyleModel> vehicleModelList = furnitureStyleModelService.getPropertyModels();	

		model.addAttribute("furnitureStyleModels", vehicleModelList);
		return "furnitureStyleModels";
	}	
	
	@PostMapping("/furnitureStyleModels/addNew")
	public String addNew(FurnitureStyleModel vehicleModel) {
		furnitureStyleModelService.save(vehicleModel);
		return "redirect:/furnitureStyleModels";
	}
	
	@RequestMapping("furnitureStyleModels/findById")
	@ResponseBody
	public Optional<FurnitureStyleModel> findById(int id) {
	  return furnitureStyleModelService.findById(id);	
	}	
	
	@RequestMapping(value="/furnitureStyleModels/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(FurnitureStyleModel vehicleModel) {
		furnitureStyleModelService.save(vehicleModel);
		return "redirect:/furnitureStyleModels";
	}
	
	@RequestMapping(value="/furnitureStyleModels/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		furnitureStyleModelService.delete(id);
		return "redirect:/furnitureStyleModels";
	}
}
