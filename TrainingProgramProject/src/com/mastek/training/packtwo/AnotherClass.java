package com.mastek.training.packtwo;

import com.mastek.training.packone.SimpleClass;

public class AnotherClass {
	
	public static void main(String[] args) {
		SimpleClass sc1 = new SimpleClass();
		// in the another class of the same package we can only access public members of the class except
		//private members
		System.out.println(
				//"Private: "+sc1.privateNumber+
				//"\nDefault: "+sc1.defaultNumber+
				//"\nProtected: "+sc1.protectedNumber+
				"\nPublic: "+sc1.publicNumber);
		
				
	
	}

}
