package com.mastek.training.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.mastek.training.Vehicle.Condition;
import com.mastek.training.Vehicle.FuelType;
import com.mastek.training.Vehicle.TransmissionType;
import com.mastek.training.Vehicle.Vehicle;
import com.mastek.training.Vehicle.VehicleCar;
import com.mastek.training.Vehicle.bootSize;
import com.mastek.training.Vehicle.roofType;

class VehicleTests {

	@Test
	void testInventory() {
	Vehicle vh=new Vehicle();
	vh.setMake ("Volvo");
	vh.setModel ("XC90");
	vh.setColour("black");
	vh.setFuelType(FuelType.Diesel);
	vh.setTransmissionType(TransmissionType.Automatic);
	vh.setPrice(6999.99);
		
	System.out.println(
			"\nMake: "+vh.getMake()+
			"\nModel: "+vh.getModel()+
			"\nColour: "+vh.getColour()+
			"\nFuel Type: "+vh.getFuelType()+
			"\nTransmission Type: "+vh.getTransmissionType()+
			"\nPrice:"+vh.getPrice()
			
			);
	
	Vehicle vh1= new Vehicle("merc","C63","white",FuelType.Diesel,TransmissionType.Automatic, 21000.99);
	
	
		
	}
	
	
	@Test
	void testVehicleCarTest() {
		VehicleCar vc=new VehicleCar("BMW","M4","White", FuelType.Diesel,TransmissionType.Automatic, 1000,Condition.New,4,4,
			bootSize.Large, roofType.Panoramic);

		
		
	System.out.println(
			"\nMake: "+vc.getMake()+
			"\nModel: "+vc.getModel()+
			"\nColour: "+vc.getColour()+
			"\nFuel Type: "+vc.getFuelType()+
			"\nTransmission Type: "+vc.getTransmissionType()+
			"\nPrice:"+vc.getPrice()+
			"\nCondition:"+vc.getCondition()+
			"\nNumberofDoors: "+vc.getNumberOfDoors()+
			"\nBootSize: "+ vc.getBootsize()
			
			);
	
	assertEquals(bootSize.Medium,vc.getBootsize(),"Wrong Boot Size");
			
	}

}
