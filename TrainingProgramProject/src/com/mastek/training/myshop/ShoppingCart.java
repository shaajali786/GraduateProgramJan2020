package com.mastek.training.myshop;

//here we are using generic type interface
//type <I>: 'I' would be defined at usage time with type of class
public interface ShoppingCart<I> {
	
	public int addItem(I i);
	public int removeItem(I i);
	public void printItems();
	public double getTotalPrice(double taxPercentage, double discountPercentage);
	
	

}
