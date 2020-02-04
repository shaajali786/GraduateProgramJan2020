package com.mastek.training.basics;

public class ExampleApplication {

	public static void main(String[] args) {
		int maxResult=0;                                 //max result=0; is a declaration that has been used multiple times
		
		maxResult = SolutionProvider.getMaxNumber(10, 2);
		System.out.println("Max Result is"+ maxResult); 
		
		maxResult = SolutionProvider.getMaxNumber(10, 10);
		System.out.println("Max Result is"+ maxResult); 
		
		maxResult = SolutionProvider.getMaxNumber(-110, -2);
		System.out.println("Max Result is"+ maxResult);
		
		maxResult = SolutionProvider.getMaxNumber(999999999, 2);
		System.out.println("Max Result is"+ maxResult); 
		
		
		SolutionProvider.multiplyTable(4);
	}

}
