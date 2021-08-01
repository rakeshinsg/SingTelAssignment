package com.singtel.b;

import com.singtel.Animal;

public class Fish implements Animal{
	private String name;
	private String size;
	private String color;
	
	
	public Fish(String name, String size, String color){
		this.name = name;
		this.size = size;
		this.color = color;
	}
	
	public void swim() {
		System.out.println(this.name+" can swim");
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
