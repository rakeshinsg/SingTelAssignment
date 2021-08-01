package com.singtel;

public interface Animal {

	default void walk() {
		System.out.println("I am walking");
	}
}