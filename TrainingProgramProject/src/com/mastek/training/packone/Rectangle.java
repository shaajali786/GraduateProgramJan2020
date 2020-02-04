package com.mastek.training.packone;


// a class can inherit from interface using the 'implements' keyboard NOT the extend keyword
// one class can implement more than one interfaces
//interfaces uses the class object for implementing its behaviours
//hence it is used frequently as it effectively saves additional number of objects being created
public class Rectangle implements Shape {
	
	private int length;
	private int breadth;
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	@Override
	public double getArea() {
	
		return (getLength()*getBreadth());
	}
	@Override
	public double getPerimeter() {
		return 2* (getLength()+getBreadth());
	}
	
	
}
