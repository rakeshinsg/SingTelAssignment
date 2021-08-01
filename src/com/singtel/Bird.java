package com.singtel;

public interface Bird extends Animal {
	
	default void fly() {
		System.out.println("I am flying");
	}
	
	default void sing() {
		System.out.println("I am singing");
	}
	
}
