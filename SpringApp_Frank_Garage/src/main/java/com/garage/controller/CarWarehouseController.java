package com.garage.controller;

import com.garage.model.CarDetails;
import com.garage.service.CarService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class CarWarehouseController {
	
	private static final Log LOG = LogFactory.getLog(CarWarehouseController.class);
	
	@Autowired
	private CarService carService;

	@GetMapping("/getallcar/{id}")
	
	public List<CarDetails> getAllCars(@PathVariable(value = "id") int noteId) throws Exception{
		LOG.info("calling car Service to retrive the selected car : " +noteId);
		return carService.retrieveAllCar(noteId);
	}
	
	@GetMapping("/getallcar")
	
	public List<CarDetails> getAllCars() throws Exception{
		int noteId = 0;
		LOG.info("calling car Service to retrive all the cars");
		return carService.retrieveAllCar(noteId);
	}

}
