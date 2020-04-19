package com.garage.model;

import java.time.LocalDate;
import java.util.Date;

/**
 * Data class for demonstration.
 * @author hari
 *
 */

public class CarDetails {

    private int _id;
    private String make;
    private String image;
 

	public void setImage(String image) {
		this.image = image;
	}
	
	   public String getImage() {
			return image;
		}

	private int year_model;
    private String model;
    private int price;
    private boolean licensed;
    private LocalDate date_added;
    
	public LocalDate getDate_added() {
		return date_added;
	}

	public void setDate_added(LocalDate date_added) {
		this.date_added = date_added;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	private String name;
    private String location;


    public int get_id() {
        return _id;
    }
    public void set_id(int _id) {
        this._id = _id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear_model() {
        return year_model;
    }

    public void setYear_model(int year_model) {
        this.year_model = year_model;
    }

    public String getModel() {
        return model;
    }
    

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isLicensed() {
        return licensed;
    }

    public void setLicensed(boolean licensed) {
        this.licensed = licensed;
    }






//    public Date getDate_added() {
//        return date_added;
//    }
//
//    public void setDate_added(Date date_added) {
//        this.date_added = date_added;
//    }



}
