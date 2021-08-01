package com.singtel.b;

public class Shark  extends Fish{

	Fish otherFIsh;
	
	Shark(String name , String size, String color) {
		super(name, size, color);
	}
	
	public void eat(Fish otherFIsh) {
		this.otherFIsh = otherFIsh;
	}

}
