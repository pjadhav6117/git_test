package com.test;

import java.io.Serializable;

public class Singleton implements Serializable,Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Singleton singleton;
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		
		if(singleton==null) {
			singleton=new Singleton();
		}
		return singleton;
	}
	
}
