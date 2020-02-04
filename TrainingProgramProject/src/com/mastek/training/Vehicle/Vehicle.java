package com.mastek.training.Vehicle;

public class Vehicle {

	private String Make;
	private String Model;
	private String Colour;
	private FuelType FuelType;
	private TransmissionType TransmissionType;
	private double Price;
	private Condition Condition; 
	
	
	public Vehicle() {
	}
	
	
	
	public Vehicle(String make, String model, String Colour, FuelType FuelType, TransmissionType TransmissionType, double price) {
		System.out.println("Inside the default Constructor");
		this.setMake(make);
		this.setModel(model);
		this.setColour(Colour);
		this.setFuelType(FuelType);
		this.setTransmissionType(TransmissionType);
		this.setPrice(price);
		
		
		System.out.println("The Make is:"+getMake());
		
		
	}
	
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	public FuelType getFuelType() {
		return FuelType;
	}
	public void setFuelType(FuelType fuelType) {
		FuelType = fuelType;
	}
	public TransmissionType getTransmissionType() {
		return TransmissionType;
	}
	public void setTransmissionType(TransmissionType transmissiontype) {
		TransmissionType = transmissiontype;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}

	public Condition getCondition() {
		return Condition;
	}

	public void setCondition(Condition condition) {
		Condition = condition;
	}
	
	
	
	
}
