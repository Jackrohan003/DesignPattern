package com.factory;

public class FactoryMain {

	public static void main(String args[]) {
		
		OperatingFactory factory = new OperatingFactory();
		
		Os os = factory.getInstance("Open");
		os.spec();
	}
	
}
