package com.mastek.training.basics.passport;

import java.util.Collection;

public interface DataAccessObjectP<P>{
	public P add (P newP);
	public Collection<PassportApplication> listAll();
	public P find(int key);
	public P remove(int key);
	

}
