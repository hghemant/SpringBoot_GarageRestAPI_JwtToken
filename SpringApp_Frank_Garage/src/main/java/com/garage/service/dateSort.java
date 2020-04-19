/*
 * Copyright (c) 2020 ING Group. All rights reserved.
 * 
 * This software is the confidential and proprietary information of ING Group ("Confidential Information").
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
		 return o2.getDate_added().compareTo(o1.getDate_added());
	}
}