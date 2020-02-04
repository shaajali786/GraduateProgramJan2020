package com.mastek.training.basics;

public class SolutionProvider {
	
	/*
	 * Take two numbers from the user and display the maximum number as output
	 * 
	 */
	// public static <return-datatype> <name> (<param_type1>, <param_type2>,...)
	 public static int getMaxNumber (int num1, int num2) {// declare inputs as params
		 int max=0; //declare output as local variable 
		 if (num1>num2) {// validate the conditions for the logical result
			max=num1;
		} else {
			max=num2;

		}
		 return max; // return the result to the caller 
	 }

	 // divide number
	public static String divideNumber (int num1, int num2) {
		int answer=0, remainder= 0;								
		
		answer = (num1/num2);
		remainder = (num1 % num2);
		
		return answer +","+ remainder;
	
	}
	// Distance in kilometers 
	public static double kmToMiles (double km) {
		double miles=0;
		
		miles= (km / 1.608);
		return miles;
	
	}

	// area of a rectangle 
	public static int areaOfARectangle (int width, int length) {
		int area=0;
		
		area= (width*length);
		
		return area;
	
		}
	//Write an algorithm and code for accepting the distance and speed values for a particular journey, calculate the time taken for the journey and display the same.
	
	public static double distSpeedJourney (double distance, double speed) { // use speed=distance/time
		double time=0;
		
		time= (distance*speed);
		return time;
		}
	
	//Write a code for accepting radius and calculate the area of the circle.
	
	public static double areaOfACircle (double radius) {
		double area=0;
		
		area=(3.14*Math.pow(radius, 2));
		return area;
				
	}
	
//Write a code for accepting a number and display the multiplication table of the given number
	
	public static void multiplyTable (int num1) {
		for (int i=1; i<11; i++) {
		System.out.println(i*num1);
		
}

		
		
//Write a code for accepting three numbers and display the lowest number out of three numbers
		/*int lowest=0
		if (num1<num2 && num1<num3) {
				lowest=num1
		}
		else if (num2<1num1 && num2<num3)
		{
			lowest = num3
		}
		else {
			lowest = num3
		}
		return lowest
		return ((num1<num2 && num1<num3)?num1:((num2<num2 && num2<num3)?num2:num3));
		
		}
	
					
	
}