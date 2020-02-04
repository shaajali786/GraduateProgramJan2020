package com.mastek.training.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mastek.training.Train.PassengerType;
import com.mastek.training.Train.TrainTicket;

class TrainTest {

	@Test
	void testCreateAndViewTrainTickets() {
		TrainTicket ti1 = new TrainTicket();
		ti1.setDepartureStation("Birmingham");
		ti1.setArrivalStation("London");
		ti1.setPricePerPassenger(10);
		ti1.setPassengerType(PassengerType.Adult);
		ti1.setNumberOfPassengers(5);
		
		System.out.println(
			 "\nDeparture Station: "+ti1.getDepartureStation()+
			 "\nArrival Station: "+ti1.getArrivalStation()+
			 "\nPrice Per Passenger: "+ti1.getPricePerPassenger()+
			 "\nPassenger Type: "+ti1.getPassengerType()+
			 "\nNumber Of Passengers: "+ti1.getNumberOfPassengers());
			 
			
	
		
	}

}
