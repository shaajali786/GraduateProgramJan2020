package com.mastek.training.Train;


public class TrainTicket {
	 private String DepartureStation;
	 private String ArrivalStation;
	 private double PricePerPassenger;
	 private PassengerType PassengerType;
	 private int NumberOfPassengers;
	 
	 
	public static final int DEFAULT_ZERO=0;
	public static final int MAX_PASSENGERS=5;
	public static final int DISCOUNT_RATE=2;
	 
	 
	 
	public String getDepartureStation() {
		return DepartureStation;
	}
	public void setDepartureStation(String departureStation) {
		DepartureStation = departureStation;
	}
	public String getArrivalStation() {
		return ArrivalStation;
	}
	public void setArrivalStation(String arrivalStation) {
		ArrivalStation = arrivalStation;
	}
	public double getPricePerPassenger() {
		if(PassengerType == PassengerType.Child) {
			PricePerPassenger= PricePerPassenger/DISCOUNT_RATE;
		}
		return PricePerPassenger;
	}
	public void setPricePerPassenger(double pricePerPassenger) {
		PricePerPassenger = pricePerPassenger;
	}
	public PassengerType getPassengerType() {
		return PassengerType;
	}
	public void setPassengerType(PassengerType passengerType) {
		PassengerType = passengerType;
	}
	public int getNumberOfPassengers() {
		return NumberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		if (NumberOfPassengers>MAX_PASSENGERS || NumberOfPassengers<DEFAULT_ZERO) {
			NumberOfPassengers=DEFAULT_ZERO;
		this.NumberOfPassengers = numberOfPassengers;
	}}
	
	public double getNetTicketPrice() {
	if (getPassengerType()== PassengerType.Child) {
		PricePerPassenger= PricePerPassenger/2;}
	return getPricePerPassenger()* NumberOfPassengers;
 }}

