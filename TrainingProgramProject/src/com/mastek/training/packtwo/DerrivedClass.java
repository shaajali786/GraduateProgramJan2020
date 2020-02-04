package com.mastek.training.packtwo;

import com.mastek.training.packone.SimpleClass;

public class DerrivedClass extends SimpleClass {
	
	public static void main(String[] args) {
		DerrivedClass sc1 = new DerrivedClass();
		// in the derrived class of another package, we can access all the public and protected members of the class
		//we cannot access  private and default members of the class
		System.out.println(
				//"Private: "+sc1.privateNumber+
				//"\nDefault: "+sc1.defaultNumber+
				"\nProtected: "+sc1.protectedNumber+
				"\nPublic: "+sc1.publicNumber);
		
				
	
	}

}
