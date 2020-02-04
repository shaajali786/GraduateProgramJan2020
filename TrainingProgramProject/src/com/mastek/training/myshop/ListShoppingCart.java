package com.mastek.training.myshop;

import java.util.LinkedList;
import java.util.List;

public class ListShoppingCart implements ShoppingCart<Item> {

	
	List<Item> items;
	
	 public ListShoppingCart() {
		items = new LinkedList<Item>();
		
		
	}
	
	
	@Override
	public int addItem(Item i) {
		items.add(i); 				// use equals method of the Items class [equals and hashcode]
		
		return items.size();
	}

	@Override
	public int removeItem(Item i) {
		System.out.println("Index of Items to be removed: "+items.indexOf(i));
		items.remove(i);
		return items.size();
	}

	@Override
	public void printItems() {
		System.out.println("Items in Cart");
		for (Item item : items) {
			System.out.println(item);
			
		}
	}

	@Override
	public double getTotalPrice(double taxPercentage, double discountPercentage) {
		// TODO Auto-generated method stub
		return 0;
	}

}
