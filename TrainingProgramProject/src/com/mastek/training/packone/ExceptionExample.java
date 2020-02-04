package com.mastek.training.packone;

import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		int num1,num2,result=0;
		
		Scanner sc = new Scanner (System.in);
	 try {
	
		 
		 System.out.println("Enter Num1: ");
		 num1 = Integer.parseInt(sc.nextLine()); // fetch the string from console and parse to int
		 
		 System.out.println("Enter Num2: ");
		 num2= Integer.parseInt(sc.nextLine());
		 
		 result = num1/num2;
		 System.out.println("Division is :"+ result);
		 
	 } 
		 
		 catch (NumberFormatException e) { // to handle specific scenarios of exceptions
				e.printStackTrace();		// it will print the exception information on the console
				System.err.println("Invalid Number Entered");
		 }
	 	 catch (Exception ex ) { 		//handles all types of exceptions
	 	 System.err.println("Exception Occurred: "+ex);					//print the exception with the message 
	 	 System.err.println("Exception Message:"+ ex.getMessage());		//print the message
	 	 ex.printStackTrace(); 			//print the complete information about exception :: stack trace
	} 
	 	finally {		//block will be executed in all the scenarios of success or failure of application 
	 		// in case the exception is not handled it will abort the application after the 'finally' block
	 	
	 		System.out.println("Scanner Closed");
	 		sc.close();
	 	}
	 //represents the rest of the code
	 System.out.println("Program Completed");
	 }
}
