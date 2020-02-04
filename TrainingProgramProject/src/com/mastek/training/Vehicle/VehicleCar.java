package com.mastek.training.Vehicle;

public class VehicleCar extends Vehicle {
	private int numberOfDoors;
	private int numberOfWheels;
	private bootSize bootsize;
	private roofType roofType;
	
	
	public VehicleCar() {
		
	}
	
	
	public VehicleCar(String make, String model, String colour,FuelType fuelType, TransmissionType transmissiontype,
					   double price, Condition condition,int numberOfDoors, int numberOfWheels,bootSize bootsize, roofType roofType) {
		
		
		this.setMake(make);
		this.setModel(model);
		this.setColour(colour);
		this.setFuelType(fuelType);
		this.setTransmissionType(transmissiontype);
		this.setPrice(price);
		this.setCondition(condition);
		this.setNumberOfDoors(numberOfDoors);
		this.setNumberOfWheels(numberOfWheels);
		this.setBootsize(bootsize);
		this.setRoofType(roofType);
	}
	
	
	
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public bootSize getBootsize() {
		return bootsize;
	}
	public void setBootsize(bootSize bootsize) {
		this.bootsize = bootsize;
	}
	public roofType getRoofType() {
		return roofType;
	}
	public void setRoofType(roofType roofType) {
		this.roofType = roofType;
	}


	@Override
	public double getPrice() {
		if(getBootsize()==bootsize.Large) {
			return super.getPrice()*2;
		}
		return super.getPrice();
	}
	
	
}
