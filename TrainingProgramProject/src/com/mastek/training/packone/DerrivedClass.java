package com.mastek.training.packone;

public class DerrivedClass extends SimpleClass {
	
	public static void main(String[] args) {
		DerrivedClass sc1 = new DerrivedClass();
		// in the derrived class we can access all the types of members of the class
		//except private members
		System.out.println(
				//"Private: "+sc1.privateNumber+
				"\nDefault: "+sc1.defaultNumber+
				"\nProtected: "+sc1.protectedNumber+
				"\nPublic: "+sc1.publicNumber);
		
				
	
	}

}
