/*
 * Copyright (c) 2020 ING Group. All rights reserved.
 * 
 * This software is the confidential and proprietary information of ING Group ("Confidential Information").
 */
package garageSecurityTest;

import static org.junit.Assert.assertEquals;

import com.garage.model.CarDetails;
import com.garage.service.CarService;

import java.io.IOException;
import java.util.List;
import org.junit.*;

/**
 * Description goes here.
 */
public class garageCarDetails {

/*
* Test is used to get all the  details of selected car  
*/

	@Test
	public void testCarDetails() throws Exception {
		CarService serviceCar = new CarService();
		List<CarDetails> retrieveAllCar = serviceCar.retrieveAllCar(12);
		for (CarDetails P : retrieveAllCar) {
			assertEquals(18371, P.getPrice());
			assertEquals(1993, P.getYear_model());
		}

	}
/*
 * Test is used for reading all the cars
 */

	@Test
	public void testAllCarDetails() throws Exception {
		CarService serviceCar = new CarService();
		List<CarDetails> retrieveAllCar = serviceCar.retrieveAllCar(0);
		assertEquals(80, retrieveAllCar.size());
	}

}
