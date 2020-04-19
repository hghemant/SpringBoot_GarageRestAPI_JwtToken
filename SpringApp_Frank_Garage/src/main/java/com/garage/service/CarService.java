package com.garage.service;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.garage.model.CarDetails;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.*;


/**
 * CarService class for connecting to json file
 * list of cars.
 * 
 * @author Hemant
 *
 */
@Repository
public class CarService {

	private List<CarDetails> mAllCar;
	private static final Log LOG = LogFactory.getLog(CarService.class);

	/**
	 * Retrieve all card.
	 * Also can REterive selected car
	 * @return
	 */

	public List<CarDetails> retrieveAllCar(int carId) throws Exception {
		File file = ResourceUtils.getFile("src/main/resources/CarWarehouse.json");
		String content = new String(Files.readAllBytes(file.toPath()));
		JSONArray warehouseArray = new JSONArray(content);
		LOG.info("Reading and stroing the Json into the array  : ");
		mAllCar = new ArrayList<CarDetails>();
		for (int i = 0; i < warehouseArray.length(); i++) {

			JSONObject warehouse = warehouseArray.getJSONObject(i);

			//System.out.println("Name of warehouse :" + warehouse.getString("name"));

			JSONObject cars = warehouse.getJSONObject("cars");

		//	System.out.println("Location of cars :" + cars.getString("location"));

			JSONArray vehiclesArray = cars.getJSONArray("vehicles");

			for (int j = 0; j < vehiclesArray.length(); j++)

			{
				CarDetails details = new CarDetails();
				JSONObject vehicle = vehiclesArray.getJSONObject(j);
				if (carId != 0) {
					if (carId == vehicle.getInt("_id")) {
						LOG.info("start getting the selected car details." + carId);
						details.setName(warehouse.getString("name"));
						details.setLocation(cars.getString("location"));
						details.set_id(vehicle.getInt("_id"));
						details.setMake(vehicle.getString("make"));
						details.setModel(vehicle.getString("model"));
						details.setImage(vehicle.getString("image"));
						details.setPrice(vehicle.getInt("price"));
						details.setLicensed(vehicle.getBoolean("licensed"));
						details.setYear_model(vehicle.getInt("year_model"));
						// details.setDate_added(vehicle.getString("date_added"));
						String fullDate = vehicle.getString("date_added");
						LocalDate dob = LocalDate.parse(fullDate);
						details.setDate_added(dob);
						System.out.println("Vehicle ID :" + vehicle.getInt("_id") + " " + "Vehicle Car :" + vehicle.getString("make") + " "
								+ "Vehicle Car :" + vehicle.getString("model"));
						mAllCar.add(0, details);
					}

				} else {
					LOG.info("start reteriving  all the  cars.");
					details.setName(warehouse.getString("name"));
					details.setLocation(cars.getString("location"));
					details.set_id(vehicle.getInt("_id"));
					details.setMake(vehicle.getString("make"));
					details.setModel(vehicle.getString("model"));
					details.setImage(vehicle.getString("image"));
					details.setPrice(vehicle.getInt("price"));
					String fullDate = vehicle.getString("date_added");
					LocalDate dob = LocalDate.parse(fullDate);
					details.setDate_added(dob);
					mAllCar.add(j, details);

				}
			}
			
		}
		mAllCar.sort(new dateSort());
		return mAllCar;
	}
}