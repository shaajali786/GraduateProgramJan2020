package com.mastek.training.hrapp.dao;

import java.util.Collection;

public interface DataAccessObject <D> {

		public D add(D newD);
		public Collection<D> listAll();
		public D find(int key);
		public D remove (int key);
			
}
