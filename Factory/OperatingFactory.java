package com.factory;

public class OperatingFactory {

	public Os getInstance(String str)
	{
		if(str.equals("Open"))
			return new Android();
		else if(str.equals("Closed"))
			return new IoS();
		else
			return new Windows();
	}
}
