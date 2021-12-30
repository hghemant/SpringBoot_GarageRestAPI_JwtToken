/*
* Hemant Gupta 
 */
package com.garage.service;

import com.garage.model.CarDetails;

/**
 * Description goes here.
 */
import java.util.Comparator;

public class dateSort implements Comparator<CarDetails> 
{
	@Override
	public int compare(CarDetails o1, CarDetails o2) {
		// TODO Auto-generated method stub
		 return o1.getDate_added().compareTo(o2.getDate_added());
	}
}
